public class SwitchStringExample
{
public static void main(String args[])
	{
		String levelString= "expert";
		int level=0;
		switch(levelString)
		{
			case "Beginner": level=1;
			break;
			case "Intermediate": level=2;
			break;
			case "Expert": level=3;
			break;
			case "Default": level=0;
			break;
		}
		System.out.println("Your level is:" +level);
	}

}