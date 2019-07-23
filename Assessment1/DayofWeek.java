import java.util.Scanner;
public class DayofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the day of the Week in number");
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
switch(n)
{
	case 1 :
			System.out.println("It is Sunday");
			break;
	case 2 :
		System.out.println("It is Monday");
		break;
	case 3 :
		System.out.println("It is Tuesday");
		break;
	case 4 :
		System.out.println("It is Wednesday");
		break;
	case 5 :
		System.out.println("It is Thursday");
		break;
	case 6 :
		System.out.println("It is Friday");
		break;
	case 7 :
		System.out.println("It is Saturday");
		break;
		
	
}

sc.close();

	}

}
