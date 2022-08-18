
public class InnerClass1 {
	private String msg="Hello Narendra Dusanapudi!!!";
	void display()
	{
		class Inner{
			void msg() {
				System.out.println(msg);
			}
		}
	Inner i = new Inner();
			i.msg();
	}
public static void main(String[] args) {
	InnerClass1 ob = new InnerClass1();
	ob.display();
	}
}
