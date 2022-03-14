//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakOfMountain {

	public static void main(String[] args) {
		class Solution {
		    public int peakIndexInMountainArray(int[] arr) {
		        int start=0;
		        int mid=0;
		        int end=arr.length-1;
		        while(start<end){
		            mid=start+(end-start)/2;
		            if(arr[mid-1]<arr[mid]&& arr[mid]>arr[mid+1]){
		                return mid;
		            }
		            if(arr[mid-1]<arr[mid]&& arr[mid]<arr[mid+1]){
		                start=mid+1;
		            }
		             if(arr[mid-1]>arr[mid]&& arr[mid]>arr[mid+1]){
		                end=mid;
		            }
		            
		        }return start;
		    }
		}
	}

}
