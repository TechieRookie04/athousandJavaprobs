package LeetcCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumSumofFourDigitNumberAfterSplittingDigits {
	public static int minimumSum(int num) {
		int sum=0;
        int[] nu=new int[4];
        int[] fnu=new int[2];
        for(int i=0;i<4;i++){
            nu[i]=(num%10);
            num=num/10;
            System.out.println("nu "+nu[i]);
        }
        System.out.println(Arrays.toString(nu));
        
        Arrays.sort(nu);
        //int p;
        System.out.println(Arrays.toString(nu));
        fnu[0]=nu[0]*10+nu[2];
        fnu[1]=nu[1]*10+nu[3];
        System.out.println(Arrays.toString(fnu));
        sum=fnu[0]+fnu[1];
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimumSum(8345));

	}

}
