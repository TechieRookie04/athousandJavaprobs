package scalarBeginner;

import java.util.Scanner;

public class electricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number of units consumed: ");
		Scanner sc=new Scanner(System.in);
		int units=sc.nextInt();
		int fbill =0;
		if(units>0 && units<=100) {
			fbill=units*5;
		}
		else if(units>100 && units<=200) {
			fbill=units*7;
		}
		else if(units>200 && units<=300) {
			fbill=units*10;
		}
		else if(units>300) {
			fbill=units*12;
		}
		
		System.out.println("Here's is your final bill: "+fbill);

	}

}
