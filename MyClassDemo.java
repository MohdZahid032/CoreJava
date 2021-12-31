abstract class Demo
{
	abstract void display(); 
}
	public class MyClass extends Demo
	{
		void display()
		{
			System.out.println("abstract Method ?");
		}
			public static void main(String args [])
			{
				Demo obj=new MyClass();
				obj.display();
			}
	}