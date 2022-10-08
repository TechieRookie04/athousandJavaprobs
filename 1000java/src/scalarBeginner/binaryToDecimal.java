package scalarBeginner;

import java.util.Scanner;

public class binaryToDecimal {
	
	public static int b2d(int a) {
		int ans =0;
		int p=1;
		while(a!=0) {
			ans=(a%10) * p + ans;
			p=p*2;
			a=a/10;
			
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the decimal to be converted to binary: ");
		int a=s.nextInt();
		System.out.println(b2d(a));
	}

}
