
public class InnerClass {
	private String msg = "Welcome Rishitha";
	class Inner{
		void hello() {
			System.out.println(msg+",Lets start our Training");
		}
		public static void main(String[] args) {
			InnerClass obj = new InnerClass();
			InnerClass.Inner in =obj.new Inner();
			in.hello();
		}
	}

}
