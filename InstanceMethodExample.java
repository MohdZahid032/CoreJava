public class InstanceMethodExample
{
	public static void main(String args [])
	{
		InstanceMethodExample obj= new InstanceMethodExample();
		System.out.println("The sum is:" +obj.add(1200,1300));
	}
		int s;
		public int add(int a, int b)
		{
			s=a+b;
			return s;
		}
}