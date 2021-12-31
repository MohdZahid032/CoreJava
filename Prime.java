import java.util.Scanner;
class Prime
{
	public static void main (String args [])
	{
		int n,count=0,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No to Check");
		n=sc.nextInt();
		i=1;
		while (i<=n)
		{
			if(n%i==0)
			count=count+1;
			i=i+1;
		}
		if ( count==2)
		System.out.println("prime");
		else
		System.out.println("Not prime");
		
	}
}