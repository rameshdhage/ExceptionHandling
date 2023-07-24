
public class ExceptionDemo {
	     public static void main(String[] args) {
		
	     System.out.println("line number one");
	     System.out.println("line number two");
	     System.out.println("line number three");
	     System.out.println("line number four");
		
	     try {
	     int a=10/0;
	     }
	     catch(Exception e) {
	    	 System.out.println(e);
	     }
	     finally {
	    	 System.out.println("ramesh");
	     }
	     System.out.println("line number five");
		 System.out.println("line number six");
		 System.out.println("line number seven");
	     

}}
