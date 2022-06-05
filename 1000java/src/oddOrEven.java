import java.util.Scanner;

public class oddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = ip.nextInt();
		if(a%2==0)
			System.out.print("It is even number");
		else
			System.out.print("It is odd number");
	}

}
