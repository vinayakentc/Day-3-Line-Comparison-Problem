package linecomparison;

import java.util.Scanner;


public class CompareMethodToCompare2Length {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First line Config");
		System.out.println("Enter the co-ordinates of First Point x1 y1");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		System.out.println("Enter the co-ordinates of Second Point x2 y2");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		double length1 = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) ) ;
		
		System.out.println("Second line Config");
		System.out.println("Enter the co-ordinates of First Point x3 y3");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		System.out.println("Enter the co-ordinates of Second Point x4 y4");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		
		double length2 = Math.sqrt( Math.pow((x4-x3),2) + Math.pow((y4-y3),2) );
		
		Double len1 = new Double(length1);
		Double len2 = new Double(length2);
		
		System.out.println(len1.compareTo(len2));

	}

}
