package paymentstrategy;
import java.io.*;


public class TennisEnroll2 {
	/*Read the input from a file and add players to Association*/
	
	public static void main(String[] argv) {
		FileInputStream fstream;
		TennisAssociation assoc = new TennisAssociation();
		PaymentMethod pm;
		
		/*Try-catch block is needed as reading from file may throw exceptions
		 * such as FileNotFound. Therefore, always perform file operations in try/catch
		 * blocks.
		*/
		try {
			fstream = new FileInputStream("playerInfo.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

			String strLine;

			/* Go through the file line by line*/
			while ((strLine = br.readLine()) != null)   {
				
				/*Split the string on , to read all required info. 
				 * Split returns an array of Strings that are separated by ','.
				*/
				String[] parts = strLine.split(",");
				assoc.addPlayer(parts[0]);
				
				if(parts[1].equals("CreditCard"))
					pm = new CreditCardPayment(parts[2], parts[3], parts[4]);
				else
					pm = new VenmoPayment(parts[2], parts[3]);
				
				assoc.makePayment(pm);
			}
			/*Close the input stream*/
			br.close();
			
			assoc.printPlayers();
			
		} catch (Exception e) {
			/*Print the exception*/
			System.out.println("Something went wrong!");
			e.printStackTrace();
		}
	}
		
}

