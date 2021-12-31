class Student
{
	int rollno;
	String name;
	Float fee;
	Student(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
		void display(){System.out.println(rollno+" "+name+" "+fee);}
}
	class TestThis2
	{
		public static void main(String args [])
		{
			Student s1=new Student(111,"anil",5000f);
			Student s2=new Student(112,"sunil",6000f);
			s1.display();
			s2.display();
		}
	}