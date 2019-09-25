package Java;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class hashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
		
		ht.put(0, "test");
		ht.put(1, "dks");
		ht.put(2, "asdf");
		ht.put(3, "poil");
		
		Set<Integer> sk= ht.keySet();
		
		Iterator<Integer> it = sk.iterator();
		
		while(it.hasNext())
		{
			
			int key = it.next();
			
			System.out.println(ht.get(key));
			
		}
		
		//System.out.println(ht);
	}

}
