// C Program for Message Queue (Reader Process)
#include <stdio.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <string.h>
// structure for message queue
struct mesg_buffer
{
	long mesg_type;
	char mesg_text[100];
} message;
int main()
{
	key_t key;
	int msgid;
	// ftok to generate unique key
	key = ftok("msg.txt", 1);
	// msgget creates a message queue
	// and returns identifier
	msgid = msgget(key, 0666 | IPC_CREAT);
	// msgrcv to receive message
	msgrcv(msgid, &message, sizeof(message), 1, 0);
	// message.mesg_text
	int tmp[20];
	int i, cnt = 0;
	for (i = 0; i < strlen(message.mesg_text); i++)
	{
		if (message.mesg_text[i] != ' ')
		{
			tmp[cnt] = message.mesg_text[i] - '0';
			cnt++;
		}
	}
	tmp[2] += '0';
	switch (tmp[2])
	{
		case 43:
			printf("%d + %d = %d\n", tmp[0], tmp[1], tmp[0] + tmp[1]);
			break;
		case 45:
			printf("%d - %d = %d\n", tmp[0], tmp[1], tmp[0] - tmp[1]);
			break;
		case 120:
		case 42:
			printf("%d * %d = %d\n", tmp[0], tmp[1], tmp[0] * tmp[1]);
			break;

		case 47:
			printf("%d / %d = %f\n", tmp[0], tmp[1], tmp[0] * 1.0 / tmp[1]);
			break;
	}
	// to destroy the message queue
	msgctl(msgid, IPC_RMID, NULL);
	return 0;
}

