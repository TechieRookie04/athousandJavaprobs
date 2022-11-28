import java.util.ArrayList;
import java.util.Scanner;

public class daysSpentTogether2409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s=new Scanner(System.in);
		/*
		 * ArrayList j=new ArrayList[4]; for(int i=1;i<=4;i++) { j[i]=s.next();
		 * //System.out.println(j); }
		 */
		/*
		 * String a=s.next(); String b="ko"; int c=0; //b=a.substring(3,5);
		 * c=Integer.parseInt(a, 3, 5, 10); System.out.println(b);
		 * System.out.println("C "+c);
		 */
		String arriveAlice = "08-15";
		String leaveAlice = "08-18";
		String arriveBob = "09-16";
		String leaveBob = "08-19";
		int aA = Integer.parseInt(arriveAlice,3,5,10);
		System.out.println("aA: "+aA);
        int aB = Integer.parseInt(arriveBob,3,5,10);
        System.out.println("aB: "+aB);
        int lA = Integer.parseInt(leaveAlice,3,5,10);
        System.out.println("lA: "+lA);
        int lB = Integer.parseInt(leaveBob,3,5,10);
        System.out.println("lB: "+lB);
        //int arrB=arriveBob.substring(3,4);
        if(Integer.parseInt(arriveAlice,0,2,10)==Integer.parseInt(arriveBob,0,2,10)) {
        int a=aA>=aB?aA-aB:aB-aA;
        System.out.println("a: "+a);
        int b=lA>=lB?lA-lB:lB-lA;
        System.out.println("b: "+b);
        int o=lB-aA;
        System.out.println("o: "+o);
        System.out.print(o-a-b);
        }
	}

}
