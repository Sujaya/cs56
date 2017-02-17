public class SimpleIcecream implements Icecream {
  private double cost = 2.0;
  @Override
  public String makeIcecream() {
    return "Vanilla Icecream";
  }
  
  @Override
  public double getCost() {
    return cost;
  }

}