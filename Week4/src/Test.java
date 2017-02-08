
class Shape {
	Shape() {
		System.out.println("I am a generic shape class.");
	}
	protected void computeArea() {
		System.out.println("I cannot compute area.");
	}
}


class Rectangle extends Shape {
	private int length = 8, breadth = 4;
	final int area = length*breadth;
	
	/* Changing the value of a variable declared as 'final' will throw compilation error.
	area = 9;
	*/
	
	Rectangle() {
		System.out.println("I am Rectangle class.");
	}
	
	/* Declaring the overridden function with access specifier more restrictive than
	 * the parent class will throw compilation error. In the example, computeArea cannot be
	 * made private; either keep it protected or can make it public.
	 
	private void computeArea() {
		System.out.println("Area of rectangle is " + length*breadth);
	}
	*/
	
	public void computeArea() {
		System.out.println("Area of rectangle is " + area);
	}
	
	final void display() {
		System.out.println("I am a final method. I cannot be overridden");
	}
	
	static void display2() {
		System.out.println("I am a static method. I cannot be overridden");
	}
}


/* A class that is declared final cannot be extended*/
final class Square extends Rectangle {
	private int length = 8;
	Square() {
		System.out.println("I am Square class.");
	}
	
	public void computeArea() {
		System.out.println("Area of square is " + length*length);
	}
	
	/* Cannot override a method declared as final. 
	 
	void display() {
		System.out.println("I am trying to override a final method; but I can't :( ");
	}
	*/
	
	
	/* Cannot override a method declared as static. 
	 
	void display2() {
		System.out.println("I am trying to override a static method; but I can't :( ");
	}
	*/
	
}

/* Below code will not compile as it tries to extend a class that is 
 * declared as 'final'.

class Trial extends Square {
	
	public void computeArea() {
		System.out.println("I am trying to compute area");
	}
}
*/



public class Test {
	public static void main(String[] args) {
		
		Square square = new Square();
		square.computeArea();
		
	}
}
