package sanfoundry;

import java.util.Scanner;

public class divby5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the number: ");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%5==0) {
			System.out.println("The Number is divisible by 5");
		}
		else {
			System.out.println("The Number is not divisible by 5");
		}
		
	}

}
