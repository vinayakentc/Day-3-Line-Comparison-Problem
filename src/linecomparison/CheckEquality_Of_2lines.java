package linecomparison;

import java.util.Scanner;

public class CheckEquality_Of_2lines {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Length Config");
		System.out.println("Enter the co-ordinates of First Point x1 y1");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		System.out.println("Enter the co-ordinates of Second Point x2 y2");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		double Length1 = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) ) ;
		
		System.out.println("Second Length Config");
		System.out.println("Enter the co-ordinates of First Point x3 y3");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		System.out.println("Enter the co-ordinates of Second Point x4 y4");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		
		double Length2 = Math.sqrt( Math.pow((x4-x3),2) + Math.pow((y4-y3),2) );
		
		Double length1 = new Double(Length1);
		Double length2 = new Double(Length2);
		
		System.out.println(length1.equals(length2));

	}

}

