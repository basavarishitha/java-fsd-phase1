
public class MethodOverload {
public void area(int a,int b) {
	double res = 0.5*a*b;
	System.out.println("Area of Triangle is" +res);
}
public void area(int r) {
	double ans= 3.14*r*r;
	System.out.println("Area of Circle is"+ans);
}
public static void main(String args[]) {
	MethodOverload m= new MethodOverload();
	m.area(10,12);
	m.area(5);
}
}
