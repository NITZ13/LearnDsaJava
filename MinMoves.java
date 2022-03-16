//https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
import java.util.Arrays;

public class MinMoves {

	public static void main(String[] args) {
		class Solution {
		    public int minMovesToSeat(int[] seats, int[] students) {
		        int ans=0;
		        Arrays.sort(seats);
		                Arrays.sort(students);
		        for(int i=0;i<seats.length;i++){
		            ans= ans + Math.abs(seats[i]-students[i]);
		        }

		   return ans; }
		}
	}

}
