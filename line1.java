package line;
/* calculate the length. As a fan of geometry,I want to model a line based on a point consisting of (x,y) co-ordinates using the cartesian system.
 * @author: Shradha Desai
 * @since: 14/06/2021
 */
import java.util.Scanner;
public class lineComparision {
	 public static void calculateLength() {
		 	Scanner scn = new Scanner(System.in);
		 	System.out.println("enter point  x1 ");
	        int x1 = scn.nextInt();
	        System.out.println("enter a point y1 ");
	        int y1 = scn.nextInt();
	        System.out.println("enter point  x2 ");
	        int x2 = scn.nextInt();
	        System.out.println("enter a point y2 ");
	        int y2 = scn.nextInt();
	       
	        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	        System.out.println("length :  " + length);
	 }
	        public static void main(String[] args) {
	        calculateLength();      	
  }
}
