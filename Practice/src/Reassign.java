
public class Reassign {
		   public static void main(String [] args) {
		      StringBuffer s1 = new StringBuffer("hello");
		      StringBuffer s2 = new StringBuffer("goodbye");
		      System.out.println(s1);
		      // At this point the StringBuffer "hello" is not eligible
		      s1 = s2;
		      // Now the StringBuffer "hello" is eligible for collection
		      System.out.println(s1);
		   }
		
}
