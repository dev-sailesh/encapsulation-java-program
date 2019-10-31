import java.util.Scanner;

public class Password
{
	Scanner input=new Scanner(System.in);
	String name;
	int pass;
	public void getdetails()
	{
		System.out.print("Please Enter Username");
		name= input.nextLine();
		System.out.print("Enter Password");
		pass=input.nextInt();
		System.out.println(name+pass);
	}
}

public class RunPassword
{
	public static void main(String[] args)
	{
		Password out= new Password();
		out.getdetails();
	}
}