class Calculator{
	public int add(int i,int j) {
		return i+j;
	}
}

public class inheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1=new Calculator();
		int result = c1.add(5, 4);
		
		System.out.println(result);
			
	}

}
