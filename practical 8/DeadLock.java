import java.util.Scanner;

class DeadLock{
    
    	public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int found,flag=0,l,tp,tr,i,j,k=1,sum=0;
    int p[][] = new int[4][5];
    int c[][] = new int[4][5];
    int m[]=new int[5];
    int r[]=new int[5];
    int a[]= new int[5];
    int temp[]=new int[5];

System.out.println("Enter total no of processes");
tp = sc.nextInt();
System.out.println("Enter total no of resources");
tr = sc.nextInt();
System.out.println("Enter claim (Max. Need) matrix\n");
for(i=0;i<tp;i++)
{
    System.out.println("process: \n"+i);
 for(j=0;j<tr;j++){
    c[i][j] = sc.nextInt();
 }
}
System.out.println("Enter allocation matrix\n");
for(i=0;i<tp;i++)
{
    System.out.println("process:\n"+i);
 for(j=0;j<tr;j++){
 p[i][j] = sc.nextInt();
 }
}
System.out.println("Enter resource vector (Total resources):\n");
for(i=0;i<tr;i++)
{
    r[i] = sc.nextInt();
}
System.out.println("Enter availability vector (available resources):\n");
for(i=0;i<tr;i++)
{
    a[i] = sc.nextInt();
 temp[i]=a[i];
}
for(i=0;i<tp;i++)
{
 sum=0;
 for(j=0;j<tr;j++)
 {
sum+=p[i][j];
 }
 if(sum==0)
 {
m[k]=i;
k++;
 }
}
for(i=0;i<tp;i++)
{
 for(l=0;l<k;l++)
 if(i!=m[l])
 {
flag=1;
for(j=0;j<tr;j++)
if(c[i][j]<temp[j])
{
 flag=0;
 break;
}
}
 if(flag==1)
 {
m[k]=i;
k++;
for(j=0;j<tr;j++)
temp[j]+=p[i][j];
 }
}
System.out.println("deadlock causing processes are:");
for(j=0;j<tp;j++)
{
 found=0;
 for(i=0;i<k;i++)
 {
if(j==m[i])
found=1;
 }
 if(found==0)
 System.out.println("\t"+j);
}

}

    
}


