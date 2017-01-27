package paymentstrategy;
import java.util.*;

public class TennisAssociation {
	private List<String> players = new ArrayList<String>();
	private PaymentMethod payMethod;
	private int fee=100;
	
	public TennisAssociation() {
		/*constructor 1*/
	}
	
	public TennisAssociation(String[] names) {
		/*constructor 2*/
		for(String name:names) 
			this.players.add(name);
	}
	
	public TennisAssociation(String[] names, int fee) {
		/*constructor 3*/
		this.fee = fee;
		for(String name:names) 
			this.players.add(name);
	}
	
	public void addPlayer(String name) {
		/*Add a new player*/
		players.add(name);
	}
	
	public void makePayment(PaymentMethod payMethod) {
		/*Make the payment using the method passed by calling function*/
		payMethod.payment(fee);
	}
	
	public void printPlayers() {
		System.out.println();
		for(String player:players)
			System.out.println(player);
		System.out.println();
	}

	
}

