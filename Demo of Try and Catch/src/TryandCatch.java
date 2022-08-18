
public class TryandCatch {
	public static void main(String args[]) {
		int []array=new int[3];
		try {
			array[7]= 3;
		}
		catch(Exception e) {
			System.out.println("Array is out of bounds!!!");
		}
		finally {
			System.out.println("The array is of size "+array.length);
		}
	}

}
