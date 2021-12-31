public class NestedSwitchExample
{
	public static void main(String args[])
	{
		char branch='M';
		int collegeyear=3;
		switch (collegeyear)
		{
			case 1:
			System.out.println("English,Science,Mathematics");
			break;
			case 2:
			switch(branch)
			{
				case 'C':
				System.out.println("operating system,java,Data structure");
				break;
				case 'E':
				System.out.println("Micro processors,Logic switching theory");
				break;
				case 'M':
				System.out.println("Drawing, Manufacturing science");
				break;
			}
				break;
				case 3:
				switch(branch)
				{
					case'C':
					System.out.println("Computer Organisation,multimedia");
					break;
					case'E':
					System.out.println("Fundamental logic design, Micro Electronics");
					break;
					case'M':
					System.out.println("Internal combustion Engine,Mechenical Vibration");
					break;
				}
					break;
					case 4:
					switch(branch)
					{
						case'C':
						System.out.println("Data Communicaton and Network Multimedia");
						break;
						case'E':
						System.out.println("Embedded System, Image Processing");
						break;
						case'M':
						System.out.println("Production Management, Thermal Engineering");
						break;
					}
					break;
		}
	}
}