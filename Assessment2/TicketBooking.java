import java.util.Scanner;

public class TicketBooking {

	String ticDesc,ticType,ticStatus,ticResolution;
	int ticNumber;
	TicketBooking(String ticDesc,String ticType,int ticNumber)
	{
		this.ticDesc=ticDesc;
		this.ticType=ticType;
		this.ticStatus="New";
		this.ticNumber= ticNumber;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.out.println("Enter 1 for Create new Ticket or 2 for exit");

		Scanner scan = new Scanner(System.in);
		int i1 = scan.nextInt();
switch(i1)
{
case 1:
	System.out.println("Enter Ticket Description");
	scan.nextLine();
	String a1=scan.nextLine();
	System.out.println("Enter Ticket Type");
	scan.nextLine();
	String b1=scan.nextLine();
	int c1=(int)(Math.random() * 3) + 100;
	TicketBooking ticketobj=new TicketBooking(a1,b1,c1);
	  System.out.println("Ticket Number: "+ticketobj.ticNumber+ ", Ticket ticStatus: "+ticketobj.ticStatus+ ", Ticket Description: "+ticketobj.ticDesc+", Ticket Type: "+ticketobj.ticType);
	  System.out.println("========================================================================");
	  System.out.print("");
	  System.out.println("Enter 3 for approve and 4 for cancel/Reject");
	  int i2=scan.nextInt();
	  if(i2==3)
	  {
		  ticketobj.ticStatus="Approved";
            System.out.println("Ticket Number: "+ticketobj.ticNumber+ ", Ticket ticStatus: "+ticketobj.ticStatus+ ", Ticket Description: "+ticketobj.ticDesc);
            
      	  System.out.println("========================================================================");
      	  System.out.print("");
		  System.out.println("Enter ticket resolution details ");
		  scan.nextLine();
		  String s3=scan.nextLine();
		  ticketobj.ticResolution=s3;
		  System.out.println("Ticket Number: "+ticketobj.ticNumber+ ", Ticket ticStatus: "+ticketobj.ticStatus+ ", Ticket Description: "+ticketobj.ticDesc+", Ticket Resolution: "+ticketobj.ticResolution);
  	  System.out.println("========================================================================");
  	  System.out.print("");
		  
		  System.out.println("Enter 5 to close the ticket ");
		  int i3=scan.nextInt();
		  if(i3==5)
		  {
			  ticketobj.ticStatus="Close";
			  System.out.println("Ticket Number: "+ticketobj.ticNumber+ ", Ticket ticStatus: "+ticketobj.ticStatus+ ", Ticket Description: "+ticketobj.ticDesc+", Ticket Resolution: "+ticketobj.ticResolution);  
		  }
		  else
		  {
			  System.out.println("Worng input, cannot close the Ticket");
		  }
		  
		  
		  
	  }
	  else if(i2==4)
	  {
		  ticketobj.ticStatus="Cancel";
		  System.out.println("Ticket Number: "+ticketobj.ticNumber+ ", Ticket ticStatus: "+ticketobj.ticStatus+ ", Ticket Description: "+ticketobj.ticDesc);
	  }
	  else
	  {
		  System.out.println("Wrong input and exiting the System");
	  }
	  
case 2:
	  System.out.println("Exiting the System");
	  break;
	}
	
}



	

}
