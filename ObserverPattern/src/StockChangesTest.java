
public class StockChangesTest {
	public static void main(String[] args) {
		
		Stock stock = new Stock();
		int stockPrice;
		
		/*create few observers*/
		Observer sh1 = new StockHolder(stock);
		Observer sh2 = new StockHolder(stock);
		Observer sh3 = new StockHolder(stock);
		
		/*register observers to the subject*/
		stock.register(sh1);
		stock.register(sh2);
		stock.register(sh3);
		
		/*Update stock price*/
		stockPrice = 20;
		stock.setPrice(stockPrice);
		
	}
}
