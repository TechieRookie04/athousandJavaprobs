package sanfoundry;

import java.util.Scanner;

public class largestAmong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of numbers: ");
		n=sc.nextInt();
		System.out.println("Enter elements of array: ");
		int a[]= new int[3];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			System.out.println("inside loop");
		}
		System.out.println("Array elements are: ");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		for(int i=1;i<=n;i++) {
		if(a[i-1]>a[i] && a[i-1]>a[i+1]) {
			System.out.println(" greatest number: "+a[i-1]);
			
		}
		else if(a[i]>a[i-1] && a[i]>a[i+1]) {
			System.out.println(" greatest number: "+a[i]);
		}
		else {
			System.out.println(" greatest number: "+a[i+1]);
		}
		}

	}

}
