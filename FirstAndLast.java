//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
public class FirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Solution {
		    public int[] searchRange(int[] nums, int target) {
		        int[] ans={-1,-1};
		         int start=0;
		    	int end=nums.length-1;
		         int start1=0;
		    	int end1=nums.length-1;
		    	//for first occurrence
		        while(end>=start){
		            
		    		int mid= start + (end-start)/2;
		            if(target>nums[end]) {
		    		start=end+1; }
		    	if(target>nums[mid]) {
		    		start=mid+1;
		    	}
		    if(target<nums[mid]) {
		    		end=mid-1;
		    	}
		    if(target==nums[mid]) {
		    	end=mid-1;
		    	     ans[0]=mid;       
		    }

		    }
		    //last occurrence	
		        while(end1>=start1){
		            
		    		int mid= start1 + (end1-start1)/2;
		            if(target>nums[end1]) {
		    		start1=end1+1; }
		    	if(target>nums[mid]) {
		    		start1=mid+1;
		    	}
		    if(target<nums[mid]) {
		    		end1=mid-1;
		    	}
		    if(target==nums[mid]) {
		    	start1=mid+1;
		    	ans[1]=mid; 
		    }
		           
		    }
		        return ans;
		    }
		}
	}

}
