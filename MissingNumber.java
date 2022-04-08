//https://leetcode.com/problems/missing-number/
//Amazon Question
public class MissingNumber {

	public static void main(String[] args) {
		class Solution {
		    public int missingNumber(int[] nums) {
		        cyclic(nums);
		        int miss=nums.length;
		        
		        for(int i=0;i<nums.length;i++)
		        {
		            if(nums[i]!=i){
		               miss=i;
		                          }
		        }
		   return miss; }
		    
		    void cyclic(int[] nums){
		        int i=0;
		        while(i<nums.length){
		            int correct=nums[i];
		            
		            if(nums[i]<nums.length && nums[i]!=nums[correct]){
		                Swap(nums,i,correct);
		            }
		            else i++;
		        }
		        
		    }
		    
		    
		    void Swap(int[] arr, int e1, int e2) {
				int temp=arr[e1];
				arr[e1]=arr[e2];
				arr[e2]=temp;
		    }
		    
		}

	}

}
