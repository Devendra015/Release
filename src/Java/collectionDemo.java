package Java;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,1,2,4,4,5};
		HashSet<Integer> hs =  new HashSet<Integer>(); 
		
		int length= a.length;
		
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		
		System.out.println(hs);
		
		Iterator<Integer> it= hs.iterator();
		
		HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
 		
		//HashSet<Integer> hs1 =  new HashSet<Integer>();
		
		while(it.hasNext())
		{
			int value = it.next();
			int count = 0;
			for(int i=0; i<a.length; i++)
			{
				if(value == a[i])
				{
				count ++;	
				}
			}
			
			hm.put(value, count);
		}
	
		Set set = hm.entrySet();
		
		Iterator it1= set.iterator();
		
		while(it1.hasNext())
		{
			Map.Entry me= (Entry) it1.next();
			int value= (int) me.getValue(); 
			if(value == 1)
			{
				System.out.println("Unique Number : " + me.getKey());
			}
		}
		
		
		//System.out.println(hm);
		
	}
}