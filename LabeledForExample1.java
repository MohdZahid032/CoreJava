public class LabeledForExample1
{
	public static void main(String args[])
	{
		aa:
		for(int i=1; i<=4;i++)
		{
			bb:
			for(int j=1; j<=4; j++)
			{
				if(i==3&&j==3)
			{
			break bb;
			}
				System.out.println(i+""+j);
			}
		}
	}
}