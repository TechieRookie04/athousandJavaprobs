
public class dollarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		//String a[][] = new String[4][4];
		String a= "$";
		for(i=1;i<=4;i++) {
			 for(j=1;j<=4;j++) { 
				 if(i==2 || i==3) {
					 if(j==3 || j==2) {
						 System.out.print(" ");
					 }
					 else {
						 System.out.print(a); 
					 }
				 }	
				 else {
				 System.out.print(a);
				 }
			} 
			 System.out.println();
		} 
			 			
		}

}
