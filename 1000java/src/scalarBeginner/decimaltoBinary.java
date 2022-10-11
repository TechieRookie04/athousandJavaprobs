package scalarBeginner;

import java.util.Scanner;

public class decimaltoBinary {
	public static void d2b(int N) {
		
		while(N!=0) {
			System.out.print(N%2);
			N=N/2;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the binary to be converted to decimal: ");
		int a=s.nextInt();
		d2b(a);
	}
}
