package paymentstrategy;
import java.util.*;

public class TennisEnroll {
	public static void main(String[] argv) {
		
		String[] names = {"Alice", "Tim", "Chris", "June"};
		
		int fee = 120;
		TennisAssociation assoc = new TennisAssociation(names,fee);
		
		/*Use the below method to keep the default fee value of 100
		TennisAssociation assoc = new TennisAssociation(names);*/
		
		assoc.printPlayers();
		
		/*Add a user who is paying using CredCard*/
		assoc.addPlayer("Mike");
		PaymentMethod creditpm = new CreditCardPayment("431254312451","900","3/17");
		assoc.makePayment(creditpm);
		
		/*Add a user who is paying using Venmo*/
		assoc.addPlayer("Janice");
		PaymentMethod venmopm = new VenmoPayment("janice_cool","pswd123");
		assoc.makePayment(venmopm);
		
		assoc.printPlayers();
		}
		 

}
