/**
*This program is the monty hall game
*@author Apurva Memani
*/
import java.util.Scanner;
public class MontyHall
{
	
	public static void main(String[] args)
	{
		description();
		game();
	}
	public static void description()
	{
		System.out.println("Welcome to the Monty Hall game!");
		System.out.println("There is a car hidden in one of the three doors");
		System.out.println("After picking your first choice I will tell you out of the");
		System.out.println("two other choices which one does not have the car.");
		System.out.println("You will then have the opportunity to switch doors or stay the same");
		
		
	}
	
	public static void game()
	{
		
		int car = ((int)Math.random()*3 + 1);
		
		System.out.println(" -------    --------    --------  ");
		System.out.println("|       |  |	    |  |        |");
		System.out.println("|       |  |	    |  |        |");
		System.out.println("|   1   |  |	2   |  |    3   |");
		System.out.println("|       |  |	    |  |        |");
		System.out.println("|       |  |	    |  |        |");
		System.out.println(" -------    --------    --------  ");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please pick a door: ");
		int userPick = keyboard.nextInt();
		int reveal = doorToReveal(car, userPick);
		System.out.println("Door Number " + reveal + " does not have the car in it.");
		keyboard.nextLine();
		System.out.println("What is the new door you would like to pick, type the same door");
		System.out.println("to stay the same: ");
		userPick = keyboard.nextInt();
		if (userPick == car)
		{
		System.out.println("Yay! You won a car!");
		}
		else
		{
		System.out.println("Sorry. Better luck next time!");
		}
	}	
	
	public static int doorToReveal(int c, int u)
	{
		int r = (int) (Math.random()*3 +1);
		while (r == c || r == u)
		{
			r = (int) (Math.random()*3 +1);
		}
		return r;
	}
			
		
		
		
		
}

	