package InterfaceConcept;

public class Developing implements BankingClient, DevClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developing d = new Developing();
		d.Login();
		
		BankingClient bc = new Developing();  //bc is responsible only for the methods of bankingclient interface
		//bc.login(); // not accessible
		
		DevClient dc= new Developing();
		dc.GetDetails();
	}

	@Override
	public void getCreditCardPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferPayment() {
		// TODO Auto-generated method stub
		
	}
	
	public void Login() {
		
	}

	@Override
	public void GetDetails() {
		// TODO Auto-generated method stub
		
	}

}
