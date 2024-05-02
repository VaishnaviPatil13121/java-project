import java.util.Scanner;
class ArDemo
{
public static void main(String args[])
{
int A[][]=new int[2][2];
System.out.println("Enter matrix A=");
Scanner p=new Scanner (System.in);
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
A[i][j]=p.nextInt();
}
}
System.out.println("Entered Matrix A=");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(A[i][j]+"\t");
}
System.out.println();
}
int B[][]=new int[2][2];
System.out.println("Enter matrix B=");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
B[i][j]=p.nextInt();
}
}
System.out.println("Entered Matrix B=");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(B[i][j]+"\t");
}
System.out.println();
}
int C[][]=new int[2][2];
System.out.println("Enter matrix C=");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
C[i][j]=A[i][j]+B[i][j];
}
}
System.out.println("Addition of Matrix A and B=");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(C[i][j]+"\t");
}
System.out.println();
}
System.out.println("Transpose of Matrix =");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(A[i][j]+"\t");
}
System.out.println();
}
}
}



