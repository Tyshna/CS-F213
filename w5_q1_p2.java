package week5;

import java.util.*;
public class w5_q1_p2
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		int ch;
		w5_q1_p1 obj = new w5_q1_p1();
		while(true)
		{
		System.out.println("Enter 1 for area of Square\nEnter 2 for area of Circle\nEnter 3 for area of Rectangle\nEnter 4 to exit");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("Enter the side of square:");
			int s = sc.nextInt();
			int area_sq = obj.calc_Area(s);
			obj.display(area_sq);
			break;
		}//case1
		case 2:
		{
			System.out.println("Enter the radius of the circle:");
			float a = sc.nextFloat();
			float area_cr = obj.calc_Area(a);
			obj.display(area_cr);
			break;
		}//case 2
		case 3:
		{
			System.out.println("Enter the sides of the rectangle:");
			float x = sc.nextFloat();
			float y = sc.nextFloat();
			float area_rec = obj.calc_Area(x, y);
			obj.display(area_rec);
			break;
		}//case3
		case 4:
			System.out.println("Exiting the program");
			System.exit(0);
		default:
			System.out.println("Invalid input");
		}//switch
		continue;
		}//while	
	}//main
}//class

