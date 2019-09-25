package Java;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "devendra";
		String reverseStr = "";
		System.out.println(str.length());
		
		
		for(int i = str.length()-1; i>=0; i--)
		{
			reverseStr = reverseStr + str.charAt(i);
			
		}
		
		System.out.println(reverseStr);
	}

}
