import java.util.Scanner;
public class Odd_Even {
	public static void main(String args[])
	{	int n;
		System.out.println("Enter the value:");
		Scanner sc= new Scanner (System.in);
		n=sc.nextInt();
		if (n%2==0)
		{
			System.out.println("The given number " +n+ " is Even");
		}
		else
		{
			System.out.println("The given number " +n+ " is Odd");	
		}
		sc.close();
		
	}
}
