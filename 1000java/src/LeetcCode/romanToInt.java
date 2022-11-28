package LeetcCode;

import java.lang.reflect.Array;
import java.util.Scanner;

public class romanToInt {
	public static int romanToInt(String s) {
		int[] a=new int[s.length()];
		for (int i = 0; i < s.length(); i++) { 
            a[i] = s.charAt(i); 
        } 
        int val=0;
        for(int x=0;x<a.length;x++){
            if(a[x]=='I'){
            		val+=1;
            	
                //System.out.println("val"+val);
                }
            
            else if(a[x]=='V'){
                val+=5;
                if(x!=0) {
            	if(a[x-1]=='I')
            		val-=2;
                }
            }
            else if(a[x]=='X'){
            	if(x!=0) {
            	if(a[x-1]=='I')
            		val-=2;
            	}
            	val+=10;
            }
            else if(a[x]=='L'){
                val+=50;
                if(x!=0) {
            	if(a[x-1]=='X')
            		val-=20;
                }

            }
            else if(a[x]=='C'){
            	val+=100;
            	if(x!=0) {
            	if(a[x-1]=='X')
            		val-=20;
            	}
            	}
            else if(a[x]=='D'){
                val+=500;
                if(x!=0) {
                if(a[x-1]=='C')
            		val-=200;
                }
            }
            else if(a[x]=='M'){
                val+=1000;
                if(x!=0) {
                if(a[x-1]=='C')
            		val-=200;
                }
            }
            
        }
        return val;
    }

    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        String n=s.next();
        System.out.println(romanToInt(n));
    }

}
