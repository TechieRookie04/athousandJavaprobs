package scalarPractice;

import java.util.Scanner;

public class sumofall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		int sum = 0;
		int count=0;
		while(count<=n) {
			sum=sum+count;
			count=count+1;
		}
		System.out.print("Sum: "+sum);
	}

}
