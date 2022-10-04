package scalarPractice;

import java.util.Scanner;

public class multipleof4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		int count=0;
		while(count<=n) {
			if(count%4==0) {
				System.out.println(count);
			}
			count=count+1;
		}
	}

}
