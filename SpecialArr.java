//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class SpecialArr {

	public static void main(String[] args) {
		class Solution {
		    public int specialArray(int[] nums) {
		        int ans=-1;
		        for(int i=1;i<=nums.length;i++){
		            int k=0;
		            for(int j=0;j<=nums.length-1;j++){
		                  if(i==nums[j]){
		                    k++;
		                }
		                 if(i<nums[j]){
		                    k++;
		                }
		                 /*if(i>nums[j]){
		                    continue;
		                }*/
		            }//eof
		             
		            if(k>0 && i==k){
		          ans=k; }
		            
		       }//eof
		        
		    return ans;  }
		}
	}

}

