
public interface Observable {

		/*methods to register and unregister observers*/
		public void register(Observer obj);
		public void unregister(Observer obj);
		
		/*method to notify observers of change*/
		public void notifyObservers();
		
		/*methods to get and set price*/
		public int getPrice();
		public void setPrice(int price);
		
}
