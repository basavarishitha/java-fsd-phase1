import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {
public static void main(String[] args) {
	//HashMap
	System.out.println("HashMap");
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(1, "Narendra");
	hm.put(2, "Rishitha");
	hm.put(3,"Jaya Krishna");
	hm.put(4, "Rama Krishna");
	System.out.println("\n The elements of HashMap are");
	for(Entry<Integer, String> m:hm.entrySet()) {
		System.out.println(m.getKey()+""+m.getValue());
	}
	//HashTable
	System.out.println("\n");
	System.out.println("HashTable");
	Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	ht.put(5, "Swathi");
	ht.put(6,"Rishi");
	ht.put(7,"Krishna");
	System.out.println("The elements of HashTable are");
	for(Entry<Integer,String> n : ht.entrySet()) {
		System.out.println(n.getKey()+""+n.getValue());
	}
	//Treemap
	TreeMap<Integer,String> t = new TreeMap<Integer,String>();
	t.put(8,"sowmya");
	t.put(9, "sandeep");
	t.put(10,"Vijaya");
	System.out.println("The elements of TreeMap are");
	for(Entry<Integer,String>l : t.entrySet()) {
		System.out.println(l.getKey()+""+l.getValue());
	}
	
}
}
