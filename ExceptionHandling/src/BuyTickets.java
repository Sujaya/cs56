
public class BuyTickets {

	   public static void main(String [] args) {
		  MovieTickets m = new MovieTickets();
	      int totalTickets = 0;
	      try {
	    	  	  System.out.println("Buying 6 tickets");
		      m.buyTickets(6);
		      totalTickets += 6;
		      System.out.println("Buying 10 tickets");
		      m.buyTickets(10);
		      totalTickets += 10;
	      }catch(InsufficientTicketsException e) {
	         System.out.println("Sorry, but available tickets are " + e.getTotalTickets());
	      }
	      /*Can have multiple catch blocks; the appropriate
	       * block based on the thrown exception is executed.
	       */
	      finally{
	    	  	System.out.println("Finally will be executed irrespective of exception!");
	    	  	System.out.println("Bought " + totalTickets + " tickets in total.");
	      }
	   }
	}