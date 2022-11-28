package LeetcCode;

public class ANumberAfteraDoubleReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=526;
		int num1=0;
		int num2=0;
		//int p=0;
		System.out.println(num);
		while(num!=0) {
			num1=num1*10+(num%10);
			//p=p*10;
			num=num/10;
		}
		System.out.println(num1);
		while(num1!=0) {
			num2=num2*10+(num1%10);
			//p=p*10;
			num1=num1/10;
		}
		System.out.println(num2);
	}

}
