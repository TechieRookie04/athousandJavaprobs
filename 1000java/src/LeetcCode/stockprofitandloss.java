package LeetcCode;

public class stockprofitandloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices= {1};
		maxProfit(prices);
	}
	public static void maxProfit(int[] prices) {
        int n=prices.length;
        int min = Integer.MAX_VALUE;
        int lar= 0;
        int minarr =0;
        for (int i=0;i<n;i++){
                if(prices[i]<min) {
                	min = prices[i];
                	minarr=i;
                	System.out.println("minval    "+minarr);
                }
                if(prices[i]-prices[minarr]>lar) {
                	lar = prices[i]-prices[minarr];
                	System.out.println("inside largeyyy");
                }
                
        }
		/*
		 * for(int i=minarr;i<n-minarr;i++) {
		 * System.out.println("iiiii"+i+" minaaaa"+minarr);
		 * if(prices[i]-prices[minarr]>=0) lar=prices[i]-prices[minarr];
		 * System.out.println("outside largeyyy"+lar); if(prices[i]-prices[minarr]>lar)
		 * {
		 * 
		 * lar = prices[i]-prices[minarr]; } }
		 */
        System.out.println("lar    "+lar);
		/*
		 * System.out.println("large value: "+lar);
		 * System.out.println("small value: "+min);
		 * System.out.println("profit: "+(min-lar)); System.out.println("");
		 */
        
        
    }

}
