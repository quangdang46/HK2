#include <stdio.h>
#include <unistd.h>
#include <limits.h>
#include <string.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#define SIZE 256
int main(int argc, char* argv[])
{
	int *shm, shmid, k,pid;
	key_t key;
	if((key=ftok(".",65))==-1){
		perror("Key created.\n");
		return 1;
	}
	shmid = shmget(key, SIZE, IPC_CREAT | 0666);
	if (shmid == -1) {
		perror("Shared memory created.\n");
		return 2;
	}
	shm = (int*) shmat(shmid, 0, 0);
	pid = fork();
	if(pid==0) { // child
		shm[0] = atoi(argv[1]);
		sleep(4);
		printf("%d!= %d\n", shm[0],shm[1]);
		shmdt((void*) shm);
		shmctl(shmid, IPC_RMID, (struct shmid_ds*) 0);
		return 0;
	}
	else if(pid >0) { // parent
 
		sleep(2);
		int i,cnt=1;
        for(i=1;i<=shm[0];i++){
            cnt*=i;
        }
        shm[1]=cnt;
		shmdt((void*) shm);
		sleep(5);
		return 0;
	}
	else { perror("Fork failed."); return 4; }
	return 0;
}
