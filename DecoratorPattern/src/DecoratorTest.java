
public class DecoratorTest {

	  public static void main(String args[]) {
	    Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
	    System.out.println(icecream.makeIcecream());
	    System.out.println("Total price of ice cream is $"+icecream.getCost());
	    
	    Icecream icecream2 = new NuttyDecorator(new SimpleIcecream());
	    System.out.println(icecream2.makeIcecream());
	    System.out.println("Total price of ice cream is $"+icecream2.getCost());
	  }

	}