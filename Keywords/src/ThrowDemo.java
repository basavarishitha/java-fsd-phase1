
public class ThrowDemo {
	public static void main(String args[]) {
		int a=2000,b=100,result;
		try {
			if(b==0)
				throw(new ArithmeticException("Can't divide by zero"));
			else {
				result=a/b;
				System.out.println("The result is :"+result);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e.getMessage());
		}
		System.out.println("End of the Program");
	}

}
