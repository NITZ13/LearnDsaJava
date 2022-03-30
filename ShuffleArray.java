//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleArray {

	public static void main(String[] args) {
		class Solution {
		    public int[] shuffle(int[] nums, int n) {
		      int [] ans=new int[nums.length];
		        int mid=(nums.length/2);
		        for(int i=0;i<mid;i++)
		            {
		            ans[i*2]=nums[i];
		            ans[i*2 +1]=nums[i+n];//kind of like sliding window
		        }
		        
		    return ans;}
		}
	}

}
