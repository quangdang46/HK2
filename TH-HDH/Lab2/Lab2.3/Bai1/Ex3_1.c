#include<stdio.h>
int main(int argc, char **argv){
    printf("Sum %s = %d\n", argv[1], sum_n(atoi(argv[1])));
    printf("Fac %s! = %d\n", argv[2], fac_n(atoi(argv[2])));
    div_n(atoi(argv[3]));
    printf("\n");
}