

import java.util.ArrayList;
import java.util.List;

public class Stock implements Observable {

	/*List of stock holders*/
	private List<Observer> observers;
	private int price=15;
	
	public Stock(){
		this.observers=new ArrayList<>();
	}
	
	@Override
	public void register(Observer obj) {
		if(!observers.contains(obj)) 
			observers.add(obj);
	}

	@Override
	public void unregister(Observer obj) {
		if(observers.contains(obj)) 
			observers.remove(obj);
	}

	/*Notify all registered stock holders about change in stock price*/
	@Override
	public void notifyObservers() {
	
		for (Observer obj : observers) {
			obj.update(price);
		}
	}

	/* Getter and setter methods for price*/
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price){
		System.out.println("Stock price changed to: "+price);
		this.price=price;
		System.out.println("Notifying stock holders about the change.\n");
		notifyObservers();
	}

}
