package InterfacePackage;

public class DeveloperClassFile implements InterfaceBankingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeveloperClassFile d = new DeveloperClassFile();

		// object.method
		//d.paycreditcard();
		d.transferbalance();
		d.checkingbalance();

		d.LoginExtraMethod();
		
		//Runtime Polymorphism
		InterfaceBankingClient dr = new DeveloperClassFile();
		dr.paycreditcard();

	}

	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("paycredit implemented");
	}

	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("transfer balance implemented");

	}

	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("checkin balance implemented");

	}

	// you can add extra method

	public void LoginExtraMethod() {
		// TODO Auto-generated method stub
		System.out.println("Login extra method is implemented");

	}

}
