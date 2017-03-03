public interface PhoneAbstractFactory {

	/* createPhone() method is returning
	 * an instance of super class Phone. Specific factory classes 
	 * will implement this interface and 
	 * return their respective sub-class.
	 */
	public Phone createPhone();

}