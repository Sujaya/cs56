import java.util.*;
import java.util.Arrays;

public class CollectionExamples {

	static void hashMapExample(){
		 HashMap< Integer, String> hMap = new HashMap< Integer, String>();
		  System.out.println("HashMap example.\n");  
	      hMap.put(1, "1st");
	      hMap.put(2, "2nd");
	      hMap.put(3, "3rd");
	      /*Get all keys, and get elements one by one to print*/
	      for(int i: hMap.keySet() ){
	    	  	System.out.println(hMap.get(i));
	      }
	      System.out.println("\n::::::::::::\n");  
	}
	
	static void removeElement() {
		  System.out.println("HashSet example.\n");
	      
	      HashSet <String>collection = new HashSet <String>();
	      String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Green";  
	      Iterator iterator;
	      
	      collection.add(str1);    
	      collection.add(str2);   
	      collection.add(str3);
	      /* str4 is not added, as HashSet contains only unique elements*/
	      collection.add(str4);
	      
	      System.out.print("Collection data: "); 
	      iterator = collection.iterator();     
	      while (iterator.hasNext()){
	         System.out.print(iterator.next() + " ");  
	      }
	      System.out.println();
	      
	      /*Removing an element*/
	      collection.remove(str2);
	      
	      System.out.println("After removing [" + str2 + "]\n");
	      System.out.print("Now collection data: ");
	      iterator = collection.iterator();
	      while (iterator.hasNext()){
	         System.out.print(iterator.next() + " ");  
	      }
	      System.out.println();
	      
	      /*Getting size of collection*/
	      int size = collection.size();
	      System.out.println("Collection size: " + size + "\n");
	      System.out.println("::::::::::::\n");
	   }
    

	static void sortingExample(){
		System.out.println("Sorting collection of user-defined objects example.\n");
		
		Fruit[] fruits = new Fruit[4];

		Fruit pineappale = new Fruit("Pineapple", 70);
		Fruit apple = new Fruit("Apple",100);
		Fruit orange = new Fruit("Orange",80);
		Fruit banana = new Fruit("Banana", 90);

		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;

		/*The Fruit class has overridden compareTo method to
		 * sort based on quantity.
		 */
		Arrays.sort(fruits);

		int i=0;
		for(Fruit temp: fruits){
		   System.out.println("Fruit " + ++i + " : " + temp.getFruitName() +
			", Quantity : " + temp.getQuantity());
		}

	}
	
	public static void main(String[] args) {
    	hashMapExample();
    	removeElement();
    	sortingExample();
   }
}
