public class PatternPyramid
{
	public static void main(String Args[])
	{
	int num=5;
	for(int i=1;i<=num;i++)
		{
		for(int j=num;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}