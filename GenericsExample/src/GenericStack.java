import java.util.*;

  public class GenericStack <T> {
	  /*A generic Stack class that can be called with any data type*/
	  
      private ArrayList<T> stack = new ArrayList<T> ();
      private int topIdx = 0;
   
      public int size () { return topIdx; }
   
      public void push (T item) {
    	topIdx++;
        stack.add(item);
     }
  
     public T pop () {
    	topIdx--;
        return stack.remove(topIdx);
        
     }
     
     public T top () {
         return stack.get(topIdx-1);
      }
  
     
     public static void main (String[] args) {
    	
    	System.out.println("Stack of Integers.");
        GenericStack<Integer> s = new GenericStack<Integer> ();
        for(int i=1; i<=10; i++)
        		s.push(i);
        int i = s.pop();
        System.out.println("Popped element: " + i);
        System.out.println("Current top of Stack is: " + s.top());
        
        System.out.println("\nStack of Strings.");
        GenericStack<String> strStack = new GenericStack<String> ();
        strStack.push("one");
        strStack.push("two");
        strStack.push("three");
        String str = strStack.pop();
        System.out.println("Popped element: " + str);
        System.out.println("Current top of Stack is: " + strStack.top());
        
     }
  
  }