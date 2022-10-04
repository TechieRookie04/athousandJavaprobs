package scalarPractice;

import java.util.Scanner;

public class n2one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to be printed:");
		int n = sc.nextInt();
		int i=n;
		while(i>0) {
			System.out.println(i);
			i=i-1;
		}
	}

}
