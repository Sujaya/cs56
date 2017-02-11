
public class VideoGames extends IndoorGames implements GameRules, Cloneable{
	/* VideoGames is inheriting from IndoorGames and also
	 * implementing two interfaces: GameRules and Cloneable.
	 */
	VideoGames(String name) {
		super("VG:"+name);
		System.out.println("VideoGames: Newly created game is a video game.\n");
	}
	
	public boolean singlePlayer() {
		return true;
	}
	public String[] getItems() {
		return gameItems;
	}
	public void setItems(String[] items) {
		for(int i=0; i<items.length; i++)
			gameItems[i] = items[i];
	}
	
	/* Notice the use of implicit 'this' pointer
	 * to access member function.
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("I am being cloned: " + this.getName() +"\n");
	    return super.clone();
	}
	
}
