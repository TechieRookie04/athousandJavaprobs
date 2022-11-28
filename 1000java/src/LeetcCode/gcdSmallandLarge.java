package LeetcCode;

import java.util.Arrays;

public class gcdSmallandLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {20,90,47,74,62,73,89};
		System.out.println(findGCD(nums));
	}
		public static int findGCD(int[] nums) {
		Arrays.sort(nums);
		Arrays.toString(nums);
		int small = nums[0];
		int large= nums[nums.length-1];
		int a1=0;
		int b1=0;
		//System.out.println(large);
		while(small!=0) {
			a1=large%small;
			b1=small;
			small=a1;
			large=b1;
			System.out.println(b1);
		}
			
		//.out.println(small);	
        
        return b1;
    }

}
