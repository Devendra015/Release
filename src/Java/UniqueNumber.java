package Java;
import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,3,2,3,3,4,4,5,1,6,5,6};
		
		ArrayList<Integer> array1= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!array1.contains(a[i]))
			{
				k++;
				
			array1.add(a[i]);
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				k++;	
				}
			}
			
			if(k==1)
			{
			System.out.println("Unique Number : " + a[i]);
			}
			}
		}
	}
}
