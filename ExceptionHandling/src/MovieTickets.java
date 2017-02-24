public class MovieTickets {
   private int totalTickets=20;
   
   public void buyTickets(int tickets) throws InsufficientTicketsException {
      if(tickets <= totalTickets) {
         totalTickets -= tickets;
         System.out.println("Successfully purchased " + tickets+".\n");
      }else {
         throw new InsufficientTicketsException(totalTickets);
      }
   }
   
   public int getTotalTickets() {
      return totalTickets;
   }
   
}
