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
        for(int x:a){
            if(x=='I'){
                val+=1;
                System.out.println("val"+val);
            }
            else if(x=='V'){
                val+=5;
            }
            else if(x=='X'){
                val+=10;
            }
            else if(x=='L'){
                val+=50;
            }
            else if(x=='C'){
                val+=100;
            }
            else if(x=='D'){
                val+=500;
            }
            else if(x=='D'){
                val+=1000;
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
