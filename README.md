# Game-of-Threes
This is a challenge from r/dailyprogrammer. It is writting in Java. This program can further be improved by allowing a user to enter
a number of their choice

public class GameofThrees
{
	public static void goThrees()
	{
		
		int number = 31337357;
		System.out.print(number+"\t");
		
		
		while (number != 1)
		{
			if(number%3 == 0)
			{
				number = number/3;
				System.out.print("0");
			}
		 	else if ((number+1)%3 == 0)
		 	{
		 		number = number +1; 
		 		System.out.print("+1");
		 	}
		 	else if  ((number-1)%3 == 0)
		 	{
		 		number = number - 1;
		 		System.out.print("-1");
		 	}
		 	System.out.print("\t");
		}
		
		System.out.println("Number is: "+number);
	}
	
	public static void main(String[]args)
	{
		goThrees();
	}
}
