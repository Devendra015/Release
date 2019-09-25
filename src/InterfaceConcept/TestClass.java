package InterfaceConcept;

class A
{
	public void testA() {}
}

class B extends A
{	
	public void testB() {}
}

public class TestClass extends B
{

	public void testC()
	{
		
	}
	
	public static void main(String[] args) {
	
	A a= new TestClass(); // Only A methods
	B b=new TestClass(); // A & B methods
	TestClass c = new TestClass(); // A and B and TestClass Methods
	
	}

}
