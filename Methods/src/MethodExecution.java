
public class MethodExecution {
	public int multiply(int a,int b)
	{
		int z= a*b;
		return z;
	}
	public static void main(String[] args) {
		MethodExecution b = new MethodExecution();
		int res=b.multiply(100,200);
		System.out.println("Multiplication is :"+res);
	}

}
