package line;
/* using equals method check equality of two lines based on end points , so that i know when 2 lines are eual
 * @author: Shradha Desai
 * @since: 14/06/2021
 */
import java.util.Scanner;
public class lineComparision {
	 public static void calculateLength() {
		 // give inputs to the co-ordinates
		 	Scanner scn = new Scanner(System.in);
		 	System.out.println("enter point  x1 ");
	        int x1 = scn.nextInt();
	        System.out.println("enter a point y1 ");
	        int y1 = scn.nextInt();
	        System.out.println("enter point  x2 ");
	        int x2 = scn.nextInt();
	        System.out.println("enter a point y2 ");
	        int y2 = scn.nextInt();
	        
	        System.out.println("enter point  a1 ");
	        int a1 = scn.nextInt();
	        System.out.println("enter a point b1 ");
	        int b1 = scn.nextInt();
	        System.out.println("enter point  a2 ");
	        int a2 = scn.nextInt();
	        System.out.println("enter a point b2 ");
	        int b2 = scn.nextInt();
	       // calculate length 1 and length 2 
	        double l1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	        System.out.println("length 1 :  " + l1);
	        double l2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
	        System.out.println("length 2 :  " + l2);
	        //compare lines using equals method
	       if(l1 == l2) {
	    	   System.out.println("line l1 is equal to l2 ");
	       } else {
	    	   System.out.println("line l1 is not equal to l2 "); 
	       }
	        String line1 = String.valueOf(l1);
	        String line2 = String.valueOf(l2);
	        boolean  equal = line1.equals(line2);
	        if(equal) {
	        	System.out.println("lines are equal ");
	        } else {
	        	System.out.println("lines are not equal "); 
	        }         
	 }
	        public static void main(String[] args) {
	        calculateLength();      	
  }
}
