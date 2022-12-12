package LeetcCode;

public class countDaysTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class Solution {
		String arriveAlice = "08-15";
		String leaveAlice = "08-18";
		String arriveBob = "09-16";
		String leaveBob = "08-19";
		    int mday[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	}
public countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
		        int start = Math.max(countDay(arriveAlice),countDay(arriveBob)); // Find the date who arrived later (because we have to find overlapping days)
		        int last = Math.min(countDay(leaveAlice),countDay(leaveBob)); // Find the date who left earlier
		        Math.max(0,last-start+1); // find the overlapping days which will be (last-start+1)
		        
		    }
		    
		    //this function returns total number of days from 1st January("01-01") to given date s
		   //for example 18th April, ("04-18"), It will return (31+28+31+18)
		    public int countDay(String s){
		        String[] temp = s.split("-");
		        int md[] = {Integer.parseInt(temp[0]),Integer.parseInt(temp[1])}; //Extract Month and date in integer from String "08-18"
		        int days=0;
		        for(int i=1;i<md[0];i++){
		            int[] mday = null;
					days+=mday[i-1];   // Calculate number of days till previous month from January
		        }
		        return days+md[1]; // add days from current month
		    }
		
	}


