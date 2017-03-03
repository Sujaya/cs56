
public class Pixel extends Phone {
	/*<Concrete Product>
	 * A concrete implementation of product Phone. 
	*/
	private String ram;
	private String memory;
	
	public Pixel(String ram, String memory){
		this.ram=ram;
		this.memory=memory;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getMemory() {
		return this.memory;
	}

}