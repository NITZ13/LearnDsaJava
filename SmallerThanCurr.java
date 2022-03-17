//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerThanCurr {

	public static void main(String[] args) {
		class Solution {
		    public int[] smallerNumbersThanCurrent(int[] nums) {
		        int[] ans=new int[nums.length];
		      for(int i=0;i<nums.length;i++){
		          int count =0;
		          int j=0;
		          while(j<nums.length){
		              if(nums[i]>nums[j]){
		                  count=count+1;
		              }
		              ++j;
		          }
		          ans[i]=count;
		      }  
		    return ans;}
		}
	}

}
