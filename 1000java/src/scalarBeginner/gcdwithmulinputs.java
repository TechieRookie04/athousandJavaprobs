package scalarBeginner;

import java.util.Scanner;

public class gcdwithmulinputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for (int t=1;t<=T;t++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int gcd=1;
			//nested loop
				for(int i=1;i<=Math.min(a, b);i++) {
					if(a%i==0 && b%i==0) {
						gcd=i;
					}
				}
				System.out.println("GCD: "+gcd);

			}
		
		}
	}


