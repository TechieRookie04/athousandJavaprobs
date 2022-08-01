/**
 * 
 */

/**
 * @author 
 *
 */
class Emp{
	
	int eid;
	int salary;
	String ceo;
	
	public void show() {
		
		System.out.println(eid+" : "+salary+" : "+ceo);
	}
	
}
public class thisKeyword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp navin = new Emp();
		navin.eid = 8;
		navin.salary=1000;
		navin.ceo="Mahesh";
		
		Emp rahul = new Emp();
		rahul.eid = 9;
		rahul.salary=5000;
		rahul.ceo="Mahesh";
		
		rahul.show();
		navin.show();
	}

}
