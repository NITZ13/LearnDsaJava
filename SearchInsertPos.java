//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPos {

	public static void main(String[] args) {
		int[] nums= {1,3,5,6};
		int ans=binarySearch(nums,5);
		System.out.println(ans);
}

	  static int binarySearch(int[] arr, int target) {
			 int start=0;
				int end=arr.length-1;
			        if(target<=arr[0]){
			            return 0;
			        }
			        
			        if(target>arr[end]){
			            return end+1;
			        }
				while(start<=end) {
					int mid= start+(end-start)/2;
				if(target<arr[mid]) {
					end=mid-1;
				}
				if(target>arr[mid]) {
					start=mid+1;
				}
				if(target==arr[mid])
	               return mid;
				}
			return start;
		}
	}
