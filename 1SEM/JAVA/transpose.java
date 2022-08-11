import java.io.*;
import java.util.*;
class transpose
{
	public static void main(String args[])
	{
		
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int c[][]=new int[10][10];
int m=0,n=0,i=0,j=0,trace=0;
Scanner z=new Scanner(System.in);
System.out.println("enter the order of matrix");
m=z.nextInt();
n=z.nextInt(); 
System.out.println("enter the elements");
for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
	{
		a[i][j]=z.nextInt();
	}
}

System.out.println("the matrix is");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(a[i][j]);
			System.out.print(" ");
			
		}
		System.out.println();
	}
for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
	{
		b[i][j]=a[j][i];
	}
}
	System.out.println("transpose is");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(b[i][j]);
			System.out.print(" ");
			
		}
		System.out.println();
	}		
}
}