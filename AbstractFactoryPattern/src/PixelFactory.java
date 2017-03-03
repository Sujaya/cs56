
public class PixelFactory implements PhoneAbstractFactory {
	/* Specific phone factory for Pixels.*/
	private String ram;
	private String memory;
	
	public PixelFactory(String ram, String memory){
		this.ram=ram;
		this.memory=memory;
	}
	@Override
	public Phone createPhone() {
		return new Pixel(ram,memory);
	}

}