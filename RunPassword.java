import java.util.Scanner;

class Password
{
	Scanner input=new Scanner(System.in);
	private String name,pass;
	private static String newpass="",newname="";
	public void username()
	{
		System.out.println("*****************");
		System.out.print("Please Enter Username: ");
		name= input.nextLine();
	}
	public void userpass()
	{
		System.out.print("Enter Password :");
		pass=input.nextLine();
		System.out.println("*****************");
	}	

	public void profile()
	{
		if((newpass.equals(pass) || "1234".equals(pass)) && "sai".equals(name))
		{
			System.out.println("*****************");
			System.out.println("Welcome, "+name);
			System.out.println("*****************");
		}
		else
		{
			System.out.println("Wrong Credentials");
		}
	}

	String getNewPass()
	{
		return pass;
	}
	void setNewPass()
	{
		System.out.print("Enter new Password: ");
		newpass=input.nextLine();
		this.pass=newpass;
	}

	/** Username Updation
	String getNewName()
	{
		return name;
	}
	void setNewName()
	{
		System.out.print("Enter new Username: ");
		newname=input.nextLine();
		this.name=newname;
	}**/
}

public class RunPassword
{
	static Scanner input=new Scanner(System.in);
	static String choice;
	public static void main(String[] args)
	{
		Password out= new Password();
		out.username();
		out.userpass();
		out.profile();
		System.out.println("*****************");
		System.out.println("1. Reset Password");
		System.out.println("2. Update Name");
		System.out.println("3. Exit");
		System.out.println("*****************");
		System.out.println("Select option");
		choice=input.nextLine();
		if("1".equals(choice))
		{
			System.out.println("Do you want to reset your password ? ( y / n )");
			choice=input.nextLine();
			if("y".equals(choice))
			{
				out.setNewPass();
				out.getNewPass();
				System.out.println("New Password : "+out.getNewPass());	
				System.out.println("Password Updated");
			}
			else{
				System.out.println("No changes done, Thank You");
			}
		}

		/***
		else if("2".equals(choice))
		{
			System.out.println("Do you want to update your username ? ( y / n )");
			choice=input.nextLine();
			if("y".equals(choice))
			{
				out.setNewName();
				out.getNewName();
				System.out.println("New Username : "+out.getNewName());	
				System.out.println("Username Updated");
			}
			else{
				System.out.println("No changes done, Thank You");
			}
		} ***/

		else{
			System.out.println("Thank You");
		}

		System.out.println("Login again ? ( y / n )");
		choice=input.nextLine();
		if("y".equals(choice))
		{
			out.username();
			out.userpass();
			out.profile();
		}
		else{
			System.out.println("Thank You");
		}
	}
}
