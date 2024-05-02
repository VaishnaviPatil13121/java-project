import java.util.Scanner;
class arrays
{
 public static void main(String args[])
 {
int A[][]=new int[2][2];
System.out.println("Enter the matrix value for matrix A:");
Scanner p=new Scanner(System.in);
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++){
A[i][j]=p.nextInt();
}
}
System.out.println("Entered value for matrix A:");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.println(A[i][j]+"\t");
}
System.out.println("");
}
int b[][]=new int[2][2];
System.out.println("Enter the value for matrix B:");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
 b[i][j]=p.nextInt();
}
}
System.out.println("Entered value for matrix B:");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.println(b[i][j]+"\t ");
}
System.out.println("");
}
int c[][]=new int [2][2];
System.out.println("Addition of matrix A & B is:");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
c[i][j]=A[i][j]+b[i][j];
System.out.println(c[i][j]+"\t");
 }
System.out.println("");
}
}
}
