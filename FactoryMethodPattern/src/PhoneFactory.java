

public class PhoneFactory {
	/* <Creator>
	 * Contains factory method.
	 */
	
	public static Phone getPhone(String type, String ram, String memory) {
		/* Factory method that return a newly created object based
		 * on the input parameter that is passed.
		 */
		if("iPhone".equalsIgnoreCase(type)) 
			return new IPhone(ram, memory);
		
		else if("Pixel".equalsIgnoreCase(type)) 
			return new Pixel(ram, memory);
		
		return null;
	}
}