import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data=new Scanner(System.in);
		 int display=1;
	        int output =1;
		System.out.println("Enter any number between 1 to 100: ");
        int n=data.nextInt();
        for (int i=1;i<=n;i++)
        {
        	System.out.print(i+" ");
        	if (output==display)
        	{
        		System.out.println();
        		display++;
        		output=1;
        		if((n-i)<display){
        			break;
        		}}
        	else{
        		output++;
        	}
        
        }
        
	
	
	}


}
