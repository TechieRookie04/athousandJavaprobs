/**
 * 
 */

/**
 * @author Srivibha
 *
 */

class Outer{
	static int a;
	public static void show() {
		
		
	}
	static class Inner{ //Outer$Inner.class
		
		public void display() {
			System.out.println("in display");
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
		//obj.show();
		
		//Outer.Inner obj1=obj.new Inner();//in order to use obj, create with parent class but in order to create constructor, create with outer class object.
		//obj1.display();
		//for static class
		Outer.Inner obj2=new Outer.Inner();
		obj2.display();
	}

}
