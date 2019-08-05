import java.util.Scanner;
public class Frequency {
	    static boolean isNumBalanced(int N) 
	    { 
	  
	        String st = "" + N; 
	        boolean isBalanced = true; 
	        int[] freq = new int[10]; 
	        int i = 0; 
	        int n = st.length(); 
	  
	        for (i = 0; i < n; i++) 
	  
	            freq[st.charAt(i) - '0']++; 
	  
	        for (i = 0; i < 9; i++) { 
	  
	          
	            if (freq[i] != freq[i + 1]) 
	                isBalanced = false; 
	        } 
	  
	       
	        if (isBalanced) 
	            return true; 
	        else
	            return false; 
	    } 
	  
	  
	    public static void main(String[] args) 
	    { 
	     
	        System.out.println("Enter the Number");
	        Scanner sc= new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        
	        boolean flag = isNumBalanced(N); 
	  
	        if (flag) 
	            System.out.println("YES"); 
	        else
	            System.out.println("NO"); 
	    } 
	} 
