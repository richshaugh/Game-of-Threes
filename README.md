# Game-of-Threes
This is a challenge from r/dailyprogrammer. It is writting in Java. 

import java.io.*;
public class GameofThrees
{
	public static void goThrees(int number)
	{
		
		
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
		
		
	}
	
	public static void main(String[]args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String choice;
		int num;
		boolean fin = true;
		
		while(fin)
		{
		System.out.print("Enter a number: ");
		line = br.readLine();
		num = Integer.parseInt(line);
		goThrees(num);
		System.out.print("Do you wish to continue?Press 0 to exit or any other key to continue: ");
		choice = br.readLine();
		if(choice.equals("0"))
	       System.exit(0);
			
	}
}
}
