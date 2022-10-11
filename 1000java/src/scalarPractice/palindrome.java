package scalarPractice;

import java.util.Scanner;

public class palindrome {


	    public static boolean isPalindrome(int x) {
	        int ans=0;
	        int p=1;
	        int x1=x;
	     while(x!=0){
	    	 
	            ans=ans*10+(x%10);
	           //System.out.println("ans "+ans);
	            p=p*10;
	            x=x/10;
	           // System.out.println(" x "+x+ " p "+p);
	            

	        }
	        System.out.println("ans: "+ans);
	        boolean res = x1==ans ? true : false;
	        System.out.println(res);
	        return res;

	    }
	    public static void main(String[] args){
	        Scanner s=new Scanner(System.in);
	        System.out.print("Enter the number to check whether its a palindrome or not: ");
	        int n=s.nextInt();
	        System.out.println(isPalindrome(n));
	    }
	
}
