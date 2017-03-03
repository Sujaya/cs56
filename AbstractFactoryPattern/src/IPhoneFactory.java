
public class IPhoneFactory implements PhoneAbstractFactory {
	/* Specific phone factory for iPhones.*/
	private String ram;
	private String memory;
	
	public IPhoneFactory(String ram, String memory){
		this.ram=ram;
		this.memory=memory;
	}
	@Override
	public Phone createPhone() {
		return new IPhone(ram,memory);
	}

}