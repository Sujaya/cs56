
public interface GameRules {
	String[] gameItems = new String[10];
	
	public boolean singlePlayer();
	public String[] getItems();
	public void setItems(String[] items);
	
}
