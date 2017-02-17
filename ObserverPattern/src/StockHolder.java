

public class StockHolder implements Observer {
	
	private Observable observable;
	
	public StockHolder(Observable obs){
		this.observable = obs;
	} 
	
	/*Method to perform when observable functionality changes.
	 * In this example, it is change in stock price.
	 */
	@Override
	public void update(int price) {
		System.out.println("Oh! Stock price value is changed to " + observable.getPrice());
	}

}
