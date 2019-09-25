package Java;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,5,8,7,4};
		
		for(int i=0; i< a.length; i++)
		{
			if(a[i]==8)
			{
				System.out.println("Index of Number: " + i );
				break;
			}
		}

	}

}
