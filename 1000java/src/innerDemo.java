/**
 * 
 */

/**
 * @author Srivibha
 *
 */

class Outer{
	int a;
	public void show() {
		
		
	}
	class Inner{
		
		public void display() {
			
		}
	}
	
}
public class innerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj=new Outer();
		obj.show();
		
		Outer.Inner obj1=obj.new Inner();//in order to use obj, create with parent class but in order to create constructor, create with outer class object.
		
	}

}
