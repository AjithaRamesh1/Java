

	import java.util.Scanner;

	public class Calc {

		Scanner sc = new Scanner(System.in);


			public void add(int n1, int n2){
				int sum = n1+n2;
				System.out.println("Sum of two numbers: "+ sum);
			}
			public void add(int n1, int n2,int n3){
				int sum = n1+n2+n3;
				System.out.println("Sum of two numbers: "+ sum);
			}
			public void subtract(int n1, int n2){
				int subtractval = n1-n2;
				System.out.println("Subtracation of two numbers: "+ subtractval);
			}
			public void subtract(int n1, int n2, int n3){
				int subtractval= n1-n2-n3;
				System.out.println("Subtracation of 3 numbers: "+subtractval);
			}
			public void multiply(int n1, int n2){
				int multiplyval = n1*n2;
				System.out.println("Multiplication of two numbers: "+ multiplyval);
			}
			public void multiply(int n1, int n2, int n3){
				int multiplyval= n1*n2*n3;
				System.out.println("Multiplication of 3 numbers: "+multiplyval);
			}
			public void divide(int n1, int n2){
				int devideval = n1/n2;
				System.out.println("Divition of two numbers: "+ devideval);
			}
			public void divide(int n1, int n2, int n3){
				int devideval1 = ((n1/n2)/n3);
				System.out.println("Divition of three numbers: "+ devideval1);
			}
}
