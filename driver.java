import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import java.io.Serializable;

public class driver implements Serializable
{
	static ArrayList<User> accountList = new ArrayList<User>();
	
	String username = "";
	String password = "";
	boolean boolTemp;
	
	
	///////////////////////RUN MAIN PROGRAM METHOD/////////////////////////////
	public static void main(String[] args)
	{
		Character curChar = new Character();
		User runner = new User();
		
		Random rand = new Random();
		Scanner userInput = new Scanner(System.in);
		
		String userResponse = "";
		
		boolean endProgram = false;
		
		System.out.println("Welcome to Jackpoint, chummer!");
		while(!endProgram)
		{
			System.out.println("Would you like to create a new account or log in?");
			userResponse = userInput.next().toLowerCase();
			////Beggining of user Creation
			if (userResponse.equals("create new account"))
			{
				User.createAccount();
			}
			////End of user creation
			
			runner = User.logIn();
			
			System.out.println("Welcome " + runner.getUsername());
			
			System.out.println();
			System.out.println("Would you like to create a new character, log out, or select a character?");
			System.out.println("(Warning, logging out closes the program)");
			userResponse = userInput.next().toLowerCase();
			
			if (userResponse.equals("log out"))
				{
					break;
				}
			else if(userResponse.equals("create a new character") || userResponse.equals("new character") || userResponse.equals("create new character"))
			{
				Character.createCharacter();//////////////////////////////////////////LAST WORKED HERE/////////////////
			}
			
		}

	}
	////////////////END OF MAIN///////////////////////////
}

//Character Constructor: Name, Alias, Meta, Ethnicity, age, karma, totalKarma, body, agility, reaction, strength, willpower, logic, intuition,
//charisma, edge, magic, magicType

//Other Constructor: Name, Alias, Ethnicity, age, karma, totalKarma, body, agility, reaction, strength, willpower, logic, intuition,
//charisma, edge, magic, magicType