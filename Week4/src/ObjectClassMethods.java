
class Student implements Cloneable {
	private String id, name;
	Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Student id: " + id);
		System.out.println("Student name: " + name + "\n");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}
}

public class ObjectClassMethods {
	public static void main(String[] args) {
		Student s1 = new Student("ucsb122", "Mike");
		Student s2 = null;
		try
	        {
	            //Creating a clone of student1 and assigning it to student2
				s2 = (Student) s1.clone();
	        }
	        catch (CloneNotSupportedException e)
	        {
	            e.printStackTrace();
	        }
		
		s2.display();
		
		System.out.println("Is student1 equal to student2? \n" + s1.equals(s2));
		
		System.out.println("Is class of student1 equal to class of student2? ");
		System.out.println(s1.getClass() == s2.getClass());
		
	}

}
