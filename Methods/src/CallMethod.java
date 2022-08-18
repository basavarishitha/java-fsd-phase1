
public class CallMethod {
	int value=200;
	int calculation(int value) {
		value = value*10/100;
		return(value);
	}
	public static void main(String[] args) {
		CallMethod d = new CallMethod();
		System.out.println("Before Calculation the value is"+d.value);
		d.calculation(10);
		System.out.println("After Calculation the value is"+d.value);
	}
}
