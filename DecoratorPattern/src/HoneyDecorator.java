public class HoneyDecorator extends IcecreamDecorator {
  /* A decorator that adds more features to plain icecream*/
  private double cost = 0.3;
  public HoneyDecorator(Icecream specialIcecream) {
    super(specialIcecream);
  }

  public String makeIcecream() {
    return specialIcecream.makeIcecream() + " with honey coating";
  }

  public double getCost() {
	    return specialIcecream.getCost() + cost;
	  }
}