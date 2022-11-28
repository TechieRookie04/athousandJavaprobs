package LeetcCode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* String[] strs=new String[]{"flow","flower","flight"}; */
		String[] strs=new String[]{""};
		String f= "";
		/*
		 * String b=String.valueOf(strs[0]);
		 * System.out.println("String output"+String.valueOf(strs[0]));
		 * System.out.println("compare toooooooo"+b.compareTo(f));
		 */
		if(strs.length==1) {
			String b=String.valueOf(strs[0]);
			System.out.println("a"+String.valueOf(strs));
			System.out.println("b"+b);
            if(b.compareTo(f)==0)
            	System.out.println("finalyyyyyyyy"+f);
            System.out.println("only 1 element"+f);
        }
		System.out.println("comp");
        for(int i=0;i<strs.length-1;i++){
            for(int j=0;j<strs.length-1;j++){
            	if(strs[i].charAt(j)==strs[i+1].charAt(j))
            			f+=Character.toString(strs[j].charAt(j));
                else {
                    System.out.println("inside loop"+f);
                    break;
                }
            }
            break;
        	
        }
        System.out.println("outside"+f);
            }
        	
        }
        //System.out.println(f+" ");

		/*
		 * String f= ""; for(int i=0;i<strs.length-1;i++){ System.out.println(i+"i ");
		 * 
		 * for(int j=0;j<strs[i].length()-4;j++){ System.out.println(j+"j ");
		 * if(strs[i].charAt(j)==strs[i+1].charAt(j))
		 * f+=Character.toString(strs[i].charAt(j)); }
		 * 
		 * }
		 */
        //while()
	


