package casting;

public class TypeCasting {

	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of a:"+a);
		int b=a;
		System.out.println("Value of b:"+b);
		float c=a;
		System.out.println("Value of c:"+c);
		System.out.println("\n");
		System.out.println("Explicit Type Casting");
		char f = 'G';
		int y = (int)f;
		System.out.println("Value of f:"+f);
		System.out.println("Value of y:"+y);

	}

}
