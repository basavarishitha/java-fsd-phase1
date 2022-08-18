
public class FinallyDemo {
	public static void main(String args[]) {
		int a=49,b=7,result = 0;
		try {
			result=a/b;
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e.getMessage());
		}
		finally
		{
			System.out.println("The result is :"+result);
		}
	}
}