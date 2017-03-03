public abstract class Phone {
	/* The abstract product class. 
	 * There will be different type of concrete 
	 * phone implementations.
	 */
	
	public abstract String getRAM();
	public abstract String getMemory();
	
	@Override
	public String toString(){
		return "RAM= "+this.getRAM()+", Memory="+this.getMemory();
	}
}