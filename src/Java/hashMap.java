package Java;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//It doesn't contain duplicate value
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(0, "dks");
		hm.put(1, "asdf");
		hm.put(2, "asdfgh");
		hm.put(2, "sadasd");
		hm.put(1, "devendra");
		hm.put(null, null);
		System.out.println(hm);
		
		
		
		//Collection<String> hs = hm.values();
		
		//Iterator<String> it=hs.iterator();
		
		Set set = hm.entrySet();
		
		Iterator it = set.iterator();
		
		//HashMap into hashset through set entry method
		
		while(it.hasNext())
		{
			Map.Entry<Integer, String> map= (Entry<Integer, String>) it.next();
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		}
		
		/*
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		
		
	}

}
