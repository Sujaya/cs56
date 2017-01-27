package paymentstrategy;

public class VenmoPayment implements PaymentMethod {
	private String username, password;
	
	public VenmoPayment(String username, String password) {
		/*constructor to store username and password of Venmo account*/
		this.username = username;
		this.password = password;
	}
	
	public void payment(int amount) {
		System.out.println(username + " successfully paid $" + amount + " using Venmo.");
	}

}
