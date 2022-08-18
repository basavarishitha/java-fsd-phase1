@SuppressWarnings("serial")
class Example extends Exception{
	String s1;
	Example(String s2){
		s1=s2;
	}
	public String toString() {
		return("MyException Occured "+s1);
	}
}
public class MyExceptionHandling {
	public static void main(String args[]) {
		try {
			System.out.println("Starting of try block");
			throw new Example("This is my error message");
		}
		catch(Example e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}
	}

}
