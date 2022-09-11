package MovieTicketBooking;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int status = 1;
		System.out.println("Enter the username:");
		String uname = sc.next();
		System.out.println("Enter the Password:");
		String password = sc.next();
		if (uname.equals("Rishitha") && password.equals("Rishitha@123")) {
			System.out.println("Your Successfully logged in.........");
			System.out.println("-----------------------------------------------------------------------------------");
			MovieTicketBooking.MovieTickets();
		} 
		else {
				System.out.println("Your Credentials are wrong Please try again.....");
				System.out.println("Do you want to redirect to login page(1.yes/2.no)");
				int ans=sc.nextInt();
				if(ans==1) {
					while(true) {
						System.out.println("Enter the username:");
						uname = sc.next();
						System.out.println("Enter the Password:");
						password = sc.next();
						if (uname.equals("Rishitha") && password.equals("Rishitha@123")) {
							System.out.println("Your Successfully logged in.........");
							System.out.println("-----------------------------------------------------------------------------------");
							MovieTicketBooking.MovieTickets();
						}
						break;
					}
					
				}
				
			}
		 	 

		}

}