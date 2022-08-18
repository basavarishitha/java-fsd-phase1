
 class Demo extends Exception {
	 public Demo(String s) {
		 super(s);
	 }
 }
public class MyException{
	public static void main(String args[]) {
		try {
			throw new Demo("temp");
		}
		catch(Demo e)
		{
			System.out.println("Caught");
			System.out.println(e.getMessage());
			}
		
	}
}
