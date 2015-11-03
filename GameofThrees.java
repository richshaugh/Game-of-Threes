import java.io.*
public class GameofThrees
{
	public static void goThrees()
	{
		
		int number = 31337357;
		System.out.println(number);
		
		
		while (number != 1)
		{
			if(number%3 == 0)
			{
				number = number/3;
				System.out.println(number+" 0");
			}
		 	else if ((number+1)%3 == 0)
		 	{
		 		number = number +1; 
		 		System.out.println(number+" +1");
		 	}
		 	else if  ((number-1)%3 == 0)
		 	{
		 		number = number - 1;
		 		System.out.println(number+" -1");
		 	}
		 	
		}
		
		System.out.println(number);
	}
	
	public static void main(String[]args)
	{
		goThrees();
	}
}