
public class InsufficientTicketsException extends Exception {
   private int totalTickets;
   
   public InsufficientTicketsException(int totalTickets) {
      this.totalTickets = totalTickets;
   }
   
   public int getTotalTickets() {
      return totalTickets;
   }
}