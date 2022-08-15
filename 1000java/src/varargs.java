/**
 * 
 */

/**
 * @author Srivibha
 *
 */
class Calcs
{
	public int add(int ... n) {
		int sum=0;
		for(int i : n) {
			sum=sum+i;
		
	}
		return sum;
}
}
public class varargs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcs obj=new Calcs();
		System.out.println(obj.add(4,5,6,7,8));

	}

}
