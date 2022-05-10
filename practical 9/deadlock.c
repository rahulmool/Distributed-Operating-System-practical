#include<conio.h>

#include<stdio.h>

void main()

{

int p[10],n,i,p1,s1,sp1,sp2;

clrscr();

printf(“Enter total no. of sites\n”);

scanf(“%d”,&n);

for(i=0;i<n;i++)

{

printf(“Enter total no. of process in S%d\n”,i+1);

scanf(“%d”,&p[i]);

}

for(i=0;i<n;i++)

{

printf(“Total no. of process in S%d are %d\n”,i+1,p[i]);

}

printf(“Enter the site no. and process id for which deadlock detection shold be initiated\n”);

scanf(“%d %d”,&s1,&p1);

printf(“Enter the the processes of two different sites connected with requesting edge\n”);

scanf(“%d %d”,&sp1,&sp2);

printf(“Probe message is (%d,%d,%d)”,p1,sp1,sp2);

if(p1==sp2)

{

printf(“Deadlock detected”);

}

else

{

getch();

}

