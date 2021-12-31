import java.util.Scanner;
class SumEvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=0;
		int b=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				a=a+i;
			}
			else
			{
				b=b+i;
			}
		}
		System.out.println("Sum of Even number "+a);
		System.out.println("Sum of Odd number "+b);
	}
}