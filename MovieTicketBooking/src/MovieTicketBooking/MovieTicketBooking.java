package MovieTicketBooking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieTicketBooking {
	private String name;
	private String theaterName;
	private int noOfTickets;
	private int cost;
	private boolean seatsInfo[];
	
	public MovieTicketBooking() {
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Enter the Name of the Movie:");
		this.name=sc.nextLine();
		System.out.println("Enter the Theater name:");
		this.theaterName=sc.nextLine();
		System.out.println("Enter the size of the Theatre (Maximum No. of Tickets:)");
		this.noOfTickets=sc.nextInt();
	    this.seatsInfo=new boolean[this.noOfTickets];
		System.out.println("Enter the Cost per Ticket:");
		this.cost=sc.nextInt();
	}
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return this.name;
	}
	void settheaterName(String theaterName) {
		this.theaterName=theaterName;
	}
	String gettheaterName() {
		return this.theaterName;
	}
	void setnoOfTickets(int noOfTickets) {
		this.noOfTickets=noOfTickets;
	}
	int getnoOfTickets() {
		return this.noOfTickets;
	}
	void setcost(int cost) {
		this.cost=cost;
	}
	int getcost() {
		return this.cost;
	}
	void storeAllDetails(String name,String brand,int memory,int camera,double price) {
		this.name=name;
		this.theaterName=theaterName;
		this.noOfTickets=noOfTickets;
		this.cost=cost;
		
	}
	void viewAllDetails() {
		System.out.println("Name of the movie:"+name);
		System.out.println("Theater Name:"+theaterName);
		System.out.println("No. Of Tickets:"+noOfTickets);
		System.out.println("Cost of the Ticket:"+cost);
		
	}
	
	void viewSeatsInfo(boolean seatslist[])
	{
		int i;
		System.out.println("\n -------------  Please see the seats information before booking  ------------------\n");
		for(i=0;i<seatslist.length;i++)
		{
			if(seatslist[i])
			{
				System.out.print((i+1)+"  booked      ");
			}
			else
			{
				System.out.print((i+1)+"  available   ");
			}
			if(i%7==0 && i!=0)
			{
				System.out.println();
			}
			
		}
	}
	
	public static void MovieTickets() {
		MovieTicketBooking movielist[]=null;
		int status;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to the Theater");
			System.out.println("Choose the service you need..");
			System.out.println("------------------------------");
			System.out.println("1.Add Movie Details");
			System.out.println("2.Search and book");
			System.out.println("3.View All");
			System.out.println("4.Update Password");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
					try {
					System.out.println("Enter no. of movies:");
					int no=sc.nextInt();
					movielist=new MovieTicketBooking[no];
					for(int i=0;i<movielist.length;i++) {
						int j=i;
						System.out.println("Enter Movie"+ ++j+"Details");
						movielist[i]=new MovieTicketBooking();
					}
					System.out.println("Data Saved........");
					break;
					}
					catch(InputMismatchException e) {
						System.out.println("You Entered a wrong input,The Process is terminated Please restart the procss.");
						System.exit(0);
					}
			case 2:
					boolean flag=true;
					sc.nextLine();
					System.out.println("Enter the Movie Name");
					String name=sc.nextLine();
					for(int i=0;i<movielist.length;i++) {
						if(movielist[i].getName().equals(name)) {
							movielist[i].viewAllDetails();
							flag=true;
							System.out.println("Would you like to book tickets for the movie?:");
							System.out.println("\n");
							System.out.println("Enter 1 to book and 2 to exit:");
							System.out.println("\n");
							int c=sc.nextInt();
							if(c==1) {
								System.out.println("Enter the no. of tickets");
								int tick=sc.nextInt();
								int ticketsAsked=tick;
								int counter=1;
								while(tick>0)
								{
									System.out.println("\nEnter seat number by looking at Availabe Seats for ticket no. "+counter);
									movielist[i].viewSeatsInfo(movielist[i].seatsInfo);
									System.out.println("\n");
									System.out.println("Enter a seat Number to book a Ticket:");
									int seatNo=sc.nextInt();
									if(movielist[i].seatsInfo[seatNo-1]==false)
									{
										movielist[i].seatsInfo[seatNo-1]=true;
										tick--;
										System.out.println("Your ticket Booked successfully");
										counter++;
									}
									else
									{
										System.out.println("Sorry, that ticket is already booked, try again...!");
									}
								}
								int tc=movielist[i].getcost()*ticketsAsked;
								System.out.println("The bill is:"+tc);
							}
							else
								break;
						}
						else
							flag=false;
					}
					if(flag==false)
						System.out.println("Not found");
					break;
			case 3:
				for(int i=0;i<movielist.length;i++) {
					movielist[i].viewAllDetails();
				}
				break;
			case 4:
				System.out.println("Do you want to reset your password(1.yes/2.no)");
				int reset = sc.nextInt();
				if (reset == 1) {
					System.out.println("Enter the new password:");
					String password="mustafa123";
					String resetpassword = sc.next();
					String newpassword = password.replace(password, resetpassword);
					System.out.println("Password Reseted Successfully.....");
					System.out.println("Your New Password is:" + newpassword);
					System.out.println("Do you want to re-loggin with new password(1.yes/2.no)");
					int num = sc.nextInt();
					if (num == 1) {
						System.out.println("Enter the username:");
						String uname = sc.next();
						System.out.println("Enter the Password:");
						password = sc.next();
						if (uname.equals("Rishitha") && password.equals(newpassword)) {
							System.out.println("Your Successfully logged in.........");
							System.out.println(
									"-----------------------------------------------------------------------------------");
						}
					} 
					else 
					{
						System.out.println("Thank you");
					}
				}
				break;

			default:
					System.out.println("Its a Wrong Choice Try Again....");
			}
			System.out.println("Do you want to continue(1.yes/2.No):");
			status=sc.nextInt();
			
		}while(status==1);
		System.out.println("The Task is Finished Completely By Rishitha Ramakrishna.....");

	}
}