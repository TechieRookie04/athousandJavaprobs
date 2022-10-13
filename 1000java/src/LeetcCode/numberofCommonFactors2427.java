package LeetcCode;

import java.util.Scanner;

public class numberofCommonFactors2427 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a>b?a:b;
	    int sum=0;
	    for(int i=1;i*2<=c;i++){
	        if(a%i==0 && b%i==0){
	        	 //System.out.println("a%i: "+i+"b%i: "+i);  
	            sum=sum+1;
	            }
	        } 
	        if(a==b)
	            sum=sum+1;
	     System.out.println("sum: "+sum);   

	}

}
