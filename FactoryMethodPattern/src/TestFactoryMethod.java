

public class TestFactoryMethod {

	public static void main(String[] args) {
		Phone iphone = PhoneFactory.getPhone("iPhone","2 GB","64 GB");
		Phone pixel = PhoneFactory.getPhone("Pixel","2 GB","32 GB");
		System.out.println("iPhone Config::"+iphone);
		System.out.println("Pixel Config::"+pixel);
	}

}