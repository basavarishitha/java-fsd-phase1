import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collection {
	public static void main(String args[]) {
		// Creating ArrayList
		System.out.println("Array List");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Bhimavaram");
		city.add("Hyderabad");
		System.out.println(city);
		//Creating Vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(100);
		vec.add(200);
		System.out.println(vec);
		//Creating Linkedlist
		System.out.println("\n");
		System.out.println("Linked List");
		LinkedList<String> names =new LinkedList<String>();
		names.add("Rishitha");
		names.add("Narendra");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// Creating Hashset
		System.out.println("\n");
		System.out.println("Hash Set");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(500);
		set.add(1000);
		System.out.println(set);
		
		//creating linkedhashset
		System.out.println("\n");
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		set1.add(2000);
		set1.add(5000);
		System.out.println(set1);
		
		
		
		
		
		
	}

}
