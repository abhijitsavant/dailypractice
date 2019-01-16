
public class WhileLoopTest {

	 public static void main(String args[]) {
	      int [] numbers = {10, 20, 30, 40, 50};
	      int i = 0;
	      while ( numbers.length>0 )  // continue jumps here
	      {
	    	  
	         if ( numbers[i]==30 ) {
	            continue ;} // Jumps to condition, i != 3
	         else {System.out.println( "Here I am!" ) ;}
	         i++;
	      }
	   }

}
