package Java;
import java.util.HashSet;
import java.util.Iterator;
		
public class hashSetExample {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//It doesn't contains duplicate value
		//there is no guarantee that element will be stored sequentially
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("dks");
		hs.add("dks");
		hs.add("dev");
		hs.add("asdf");
		hs.add("project");
		
		//System.out.println(hs);
		Iterator<String> it= hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
