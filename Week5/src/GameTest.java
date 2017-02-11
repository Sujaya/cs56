
public class GameTest {
	public static void main(String[] args) {
		Games[] games = new Games[3];
		
		VideoGames vg1 = new VideoGames("FIFA");
		String[] items1 = {"Xbox", "Controls", "Screen"};
		vg1.setItems(items1);
		games[0] = vg1;
		
		VideoGames vg2 = new VideoGames("Call of Duty");
		String[] items2 = {"PS4", "Screen", "Soundsystem"};
		vg2.setItems(items2);
		games[1] = vg2;
		
		/*Lets clone an object*/
		VideoGames vg3 = null;
		try
        {
			vg3 = (VideoGames) vg1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
		games[2] = vg3;
		
		/*Print all games*/
		for(Games g: games) 
			System.out.println("Name of game is: " +g.getName());
		
	}
}
