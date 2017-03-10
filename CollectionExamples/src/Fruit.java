public class Fruit implements Comparable<Fruit>{
	/*Example of class that implements Comparable.*/
	
	private String fruitName;
	private int quantity;

	public Fruit(String fruitName, int quantity) {
		this.fruitName = fruitName;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public int compareTo(Fruit compareFruit) {
		/* Comparator function: returns +ve, -ve or 0 integers, 
		 * based on which sorting is performed*/

		int compareQuantity = compareFruit.getQuantity();
		return this.quantity - compareQuantity;

	}
}