//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class SpecialArr {

	public static void main(String[] args) {
		class Solution {
		    public int specialArray(int[] nums) {
		        int n = nums.length;
		        for (int i = 0; i <= n; i++) {
		            int count = 0;
		            for (int j = 0; j < n; j++) {
		                if (nums[j] >= i) {
		                    count++;
		                }
		            }
		            if (count == i) {
		                return i;
		            }
		        }
		        return -1;
		    }
		}
		//this code didnt work
		/*
		 class Solution {
    
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<=nums.length-1;i++){

            int k=0;
            for(int j=0;j<=nums.length-1;j++){
                
                if(nums[i]==nums[j]){
                    k++;
                }
                 if(nums[i]<nums[j]){
                    k++;
                }
                 if(nums[i]>nums[j]){
                    continue;
                }
                
            }
            
     if(k>0 && nums[i]>0){
      if(k>ans){
          ans=k;
      }
      return ans;} 
     }
    
   return -1; }
   */
	}

}
