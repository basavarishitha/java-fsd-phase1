
public class ThrowsDemo {
	void divison() throws ArithmeticException{
		int a=1000,b=200,result;
		result=a/b;
		System.out.println("The result is :"+result);
		
		
	}
	public static void main(String args[]) {
		ThrowsDemo t=new ThrowsDemo();
		try {
			t.divison();
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		System.out.println("End of the program");
	}

}
