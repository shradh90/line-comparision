package geolength;
import java.util.Scanner;
public class length {
	public static void main(String[] args) {
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
        
        double l1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("length 1:  " + l1);
        double l2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
        System.out.println("length 2 :  " + l2);
       if(l1 == l2) {
    	   System.out.println("line l1 is equal to l2 ");
       } else {
    	   System.out.println("line l1 is not equal to l2 "); 
       }
        String line1 = String.valueOf(l1);
        String line2 = String.valueOf(l2);
        boolean  equal = line1.equals(line2);
        if(equal) {
        	System.out.println("line l1 is equal to l2 ");
        } else {
        	System.out.println("line l1 is not equal to l2 "); 
        }
	}
}
