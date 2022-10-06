package scalarBeginner;

import java.util.Scanner;

public class gcdof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers to find the GCD: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int min,max,gcd=0;
		if(a>b) {
			min=b;
			max=a;
		}
		else {
			min=a;
			max=b;
		}
		for(int i=1;i<=min;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		System.out.println("GCD: "+gcd+"\nmax: "+max);

	}

}
