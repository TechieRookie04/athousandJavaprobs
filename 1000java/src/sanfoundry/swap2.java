package sanfoundry;

import java.util.Scanner;

public class swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b=sc.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("1st: "+a+" 2nd "+b);
		
	}

}
