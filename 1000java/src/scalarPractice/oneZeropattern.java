package scalarPractice;

import java.util.Scanner;

public class oneZeropattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter the number of times to be printed: ");
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			for(int j=0;j<=i;j++) {
				if(i%2==0)
					if(j%2==0)
						System.out.print("1 ");
					else
						System.out.print("0 ");
				else if(i%2!=0)
					if(j%2==0)
						System.out.print("0 ");
					else
						System.out.print("1 ");
			}
			System.out.println();
		}
	}

}
