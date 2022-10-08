package scalarBeginner;

import java.util.Scanner;

public class gcdEuclids {

	public static int gcd(int a,int b) {
		int a_,b_=0;
		for(;a!=0;) {
			a_=b%a;
			b_=a;
			a=a_;
			b=b_;
					
		}
		return b_;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the two numbers to find GCD: ");
		int a =s.nextInt();
		int b =s.nextInt();
		System.out.println(gcd(a,b));
	}

}
