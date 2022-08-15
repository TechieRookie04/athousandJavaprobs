
public class d2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3 };

		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
		for (int k : a) {
			System.out.println(k);
		}
		
		  
		  int b[]= {4,5,6}; int c[]= {7,8,9};
		  
		  int d[][]= { {1,2,3}, {4,5,6}, {7,8,9}
		  
		  
		  }; 
		  //System.out.println(d[0][1]); 
		  for(int i=0;i<d.length;i++) { 
			  for(int j=0;j<d[i].length;j++) { 
				  System.out.print(" "+d[i][j]); }
		  System.out.println(); }
		  
		  for(int k[]: d) {
			  for(int l :k) {
				  System.out.println(" "+l);
			  }
			  System.out.println(); 
		  }
		 
	}

}
