import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class User implements Serializable
{
	/**
	 * IDK
	 */
	private static final long serialVersionUID = 1L;
	private static Scanner userScan = new Scanner(System.in);
	
	private String username = "";
	private String password = "";
	
	private String name;
	private ArrayList<Character> charList = new ArrayList<Character>();
	
	//User constructor.  details set with getter and setter methods.
	public User()
	{
		
	}

	
	////////ACCOUNT CREATION METHOD
	public static void createAccount()
	{
		User tempRunner = new User();
		String ccUsername = "";
		String ccPassword = "";
		String ccName = "";
		boolean temp = false;
		
		System.out.println("Please enter your username: ");
		ccUsername = userScan.next();
		
		////Determines if the username is taken or not
		for (int i = 0; i < driver.accountList.size(); i++)
		{
			if (ccUsername.equals(driver.accountList.get(i).getUsername()))
				temp = true;
		}
		while(temp)
		{
			System.out.println("Username taken. Please enter a new username: ");
			ccUsername = userScan.next();
			////Determines if the username is taken or not
			for (int i = 0; i < driver.accountList.size(); i++)
			{
				if (ccUsername.equals(driver.accountList.get(i).getUsername()))
					temp = false;
				else
					temp = true;
			}
		}
		tempRunner.setUsername(ccUsername);
		
		System.out.println("Please enter your password: ");
		ccPassword = userScan.next();
		tempRunner.setPassword(ccPassword);
		
		System.out.println("Please enter your name: ");
		ccName = userScan.next();
		tempRunner.setName(ccName);
		
		driver.accountList.add(tempRunner);
		System.out.println("Account creation successful...");
	}
	//////////END OF ACCOUNT CREATION METHOD/////////////////////////////////////
	
	/////////ACCOUNT LOG IN METHOD/////////////////////////////////
	public static User logIn()
	{
		boolean tempBool2 = true;
		String curUsername = "";
		String curPassword = "";
				
		while(true)
		{
			if (!tempBool2)
				System.out.println("Username or password is incorrect.");
			
			System.out.println("Please enter your username: ");
			curUsername = userScan.next();
			
			System.out.println("Please enter your password: ");
			curPassword = userScan.next();
			
			for (int i = 0; i < driver.accountList.size(); i++)
			{
				if (curUsername.equals(driver.accountList.get(i).getUsername()) && curPassword.equals(driver.accountList.get(i).getPassword()))
						return driver.accountList.get(i);
			}
		}
	}
	////////END OF LOG IN METHOD
	
	/////////////////GETTER AND SETTER METHODS FOR USER CLASS//////////////////////////////
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public ArrayList<Character> getCharList()
	{
		return charList;
	}
	public void setCharList(ArrayList<Character> charList)
	{
		this.charList = charList;
	}
}
