package scalarBeginner;

import java.util.Scanner;

public class calBurn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of calories you want to burn: ");
		int a=sc.nextInt();
		int cal=0;
		while(cal<=a) {
			System.out.println("Running 1 calorie: " +cal);
			cal = cal+1;
			
		}
	}

}
