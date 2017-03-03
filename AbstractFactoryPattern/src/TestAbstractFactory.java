
public class TestAbstractFactory {

	public static void main(String[] args) {

		/* A type of PhoneAbstractFactory is passed as input.
		 * Specific type of Phone object is given as output.
		 */
		Phone iPhone = PhoneFactory.getPhone(new IPhoneFactory("2 GB","64 GB"));
		Phone pixel =  PhoneFactory.getPhone(new PixelFactory("2 GB","32 GB"));
		System.out.println("AbstractFactory IPhone Config::"+iPhone);
		System.out.println("AbstractFactory Pixel Config::"+pixel);
	}
}