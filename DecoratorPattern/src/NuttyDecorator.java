public class NuttyDecorator extends IcecreamDecorator {
  /* A decorator that adds more features to plain icecream*/
  private double cost = 0.5;
  public NuttyDecorator(Icecream specialIcecream) {
    super(specialIcecream);
  }

  public String makeIcecream() {
    return specialIcecream.makeIcecream() + " with cruncy nuts";
  }
  
  public double getCost() {
	    return specialIcecream.getCost() + cost;
	  }
}