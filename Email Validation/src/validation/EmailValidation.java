package validation;
import java.util.*;
public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String search;
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		a.add("rishithabasava@gmail.com");
		a.add("rishithabasava123@gmail.com");
		a.add("narendradusanapudi@gmail.com");
		a.add("rishitha515@sasi.ac.in");
		System.out.println("Enter the mail id that have to be searched");
		search=sc.next();
		if(a.contains(search)) {
			System.out.println("The email " +search+ " is found");
			
		}
		else
		{
			System.out.println("The email "+search+ " is not found");
		}

	}

}
