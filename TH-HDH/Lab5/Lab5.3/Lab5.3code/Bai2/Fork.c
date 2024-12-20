#include <stdio.h>
#include <unistd.h>
#include <limits.h>
#include <string.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#define SIZE 256
int main(int argc, char *argv[])
{
	int *shm, shmid, k, pid;
	key_t key;
	if ((key = ftok(".", 65)) == -1)
	{
		perror("Key created.\n");
		return 1;
	}
	shmid = shmget(key, SIZE, IPC_CREAT | 0666);
	if (shmid == -1)
	{
		perror("Shared memory created.\n");
		return 2;
	}
	shm = (int *)shmat(shmid, 0, 0);
	pid = fork();
	if (pid == 0)
	{ // child
		shm[0] = atoi(argv[1]);
		shm[1] = atoi(argv[2]);
		shm[2] = (int)(argv[3][0]);
		sleep(3);
		switch (shm[2])
		{
			case 43:
				printf("%d+%d=%d\n", shm[0],shm[1],shm[3]);
				break;
			case 45:
				printf("%d-%d=%d\n", shm[0],shm[1],shm[3]);
				break;
			case 120:
				printf("%d*%d=%d\n", shm[0],shm[1],shm[3]);
				break;
			case 47:
				printf("%d/%d=%d\n", shm[0],shm[1],shm[3]);
				break;

		}
		shmdt((void *)shm);
		shmctl(shmid, IPC_RMID, (struct shmid_ds *)0);
		return 0;
	}
	else if (pid > 0)
	{ // parent
		printf("Data %d",shm[2]);
		sleep(1);
		if(shm[2]==43){
			shm[3]=shm[1]+shm[0];
		}else if(shm[2]==45){
			shm[3]=shm[1]-shm[0];
		}else if(shm[2]==120){
			shm[3]=shm[1]*shm[0];
		}else if(shm[2]==47){
			shm[3]=shm[0]*1.0/shm[1];
		}
		shmdt((void *)shm);
		sleep(5);
		return 0;
	}
	else
	{
		perror("Fork failed.");
		return 4;
	}
	return 0;
}

