
abstract class InnerClass3 {
	public abstract void display();
	}
	public class InnerClass2{
		public static void main(String[] args) {
			InnerClass3 i= new InnerClass3() {
				public void display() {
					System.out.println("Hello Everyone..!!,How are you..?");
				}
			};
			i.display();
		}
	}


