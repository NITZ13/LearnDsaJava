//https://leetcode.com/problems/squares-of-a-sorted-array/
public class SortedSquare {

	public static void main(String[] args) {
		class Solution {
		    public int[] sortedSquares(int[] nums) {
		        int[] ans= new int[nums.length];
		        int index= nums.length-1;
		        int end=index;
		       int start=0;
		    while(start<=end){
		        if(Math.abs(nums[start])>Math.abs(nums[end])){
		            ans[index]=nums[start]*nums[start];
		            start++;
		           index--;
		        }
		        else{
		                        ans[index]=nums[end]*nums[end];
		            end--;
		          index--;

		        }
		    }
		   return ans; }
		}
	}

}
