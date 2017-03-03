public class PhoneFactory {

	/*Similar to PhoneFactory of Factory Method Pattern
	 * but instead of an if-else based function, is used
	 * specific classes for generating their objects.
	 */
	public static Phone getPhone(PhoneAbstractFactory factory){
		return factory.createPhone();
	}
}