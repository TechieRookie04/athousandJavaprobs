package LeetcCode;

import java.util.Scanner;

public class sumOfDigitEven {
	
	 public static int countEven(int num) {
	        //int[] arr=new int[num];
	        //int j=0;
	       
	       
	        int j=0;
	       for(int i=1;i<=num;i++){
	    	   j=i;
	    	   System.out.print(" j "+j);
	    	   int sum=0;
	         while(j!=0) {
	               sum=j%10+sum;
	               j=j/10;
	               System.out.print(" sum "+sum);
	           }
	           if(sum%2==0)
	                count+=1;
	           System.out.print(" count "+count);
	        System.out.println();
	       }
	       
	    return count;        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 numbers");
		int a=sc.nextInt();
		System.out.println(countEven(a));

	}

}
