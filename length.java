package geolength;

import java.util.Scanner;

public class length {
	public static void main(String[] args) {
        System.out.println("enter point  x1 ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        System.out.println("enter a point y1 ");
        Scanner sc1 = new Scanner(System.in);
        int y1 = sc1.nextInt();
        System.out.println("enter point  x2 ");
        Scanner sc2 = new Scanner(System.in);
        int x2 = sc2.nextInt();
        System.out.println("enter a point y2 ");
        Scanner sc3 = new Scanner(System.in);
        int y2 = sc3.nextInt();
        int x = (x2 - x1) * (x2 - x1);
        int y = (y2 - y1) * (y2 - y1);
        int t = x + y;
        double length = Math.sqrt(t);
        System.out.println("length :  " + length);
        
	}
}
