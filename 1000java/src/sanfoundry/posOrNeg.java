package sanfoundry;

import java.util.Scanner;

public class posOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter number: ");
		int a= sc.nextInt();	
		if(a<0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is positive");

		}
	}

}
