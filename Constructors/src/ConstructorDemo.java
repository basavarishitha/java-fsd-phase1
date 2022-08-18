class Empinfo{
	int id;
	String name;
	void display()
	{
		System.out.println(id +""+name);
	}
}
public class ConstructorDemo {
	public static void main(String args[]) {
		Empinfo emp1=new Empinfo();
		Empinfo emp2=new Empinfo();
		emp1.display();
		emp2.display();
	}

}
