import java.util.ArrayList;
import java.util.List;

public class Games {
	private List<String> players = new ArrayList<String>();
	private String gameName;
	
	Games(String name) {
		this.gameName = name;
		System.out.println("Games: A new game " + gameName + " is created.");
	}
	
	public String getName() {
		return gameName;
	}
	
	public void addPlayers(String[] names) {
		for(String name:names) 
			players.add(name);
	}
	
}
