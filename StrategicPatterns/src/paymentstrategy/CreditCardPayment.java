package paymentstrategy;

public class CreditCardPayment implements PaymentMethod {
	private String cardNo, cvv, dateOfExpiry;
	
	public CreditCardPayment(String cardNo, String cvv, String dateOfExpiry) {
		/*constructor to store all card details*/
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
			
	}
	public void payment(int amount ) {
		System.out.println("Successfully paid $" + amount + " using card: " + cardNo);
	}
}
