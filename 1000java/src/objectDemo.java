class Calc
{
	int num1;
	int num2;
	int result;
	
	public Calc() {
		num1=1;
		num2=2;
	}
	public Calc(int a, double d) {
		result=a+(int) (d);
		
	}

}

public class objectDemo {

	public static void main(String[] args) {
		Calc obj=new Calc();
		Calc obj1=new Calc(5, 7.9);
		System.out.println(obj.result);
		System.out.println(obj1.result);
		
	}
}
