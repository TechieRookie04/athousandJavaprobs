package scalarPractice;

import java.util.Scanner;

public class even1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		int i=0;
		while(i<=n) {
			if(i%2==0) {
			System.out.println(i);
			}
			i=i+2;
		}
	}

}
