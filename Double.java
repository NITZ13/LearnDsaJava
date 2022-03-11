//https://leetcode.com/problems/check-if-n-and-its-double-exist
import java.util.Arrays;

public class Double {

	public static void main(String[] args) {
		int[] arr= {0,0};
boolean ans= checkIfExist(arr);
System.out.println(ans);
	}

	private static boolean checkIfExist(int[] arr) {
		   if (arr.length<=1){
	            return false;
	        }
	        Arrays.sort(arr);
	        for (int i=0; i < arr.length-1; i++){
	            if (findDouble(arr,i+1,arr.length-1, arr[i]) || findDouble(arr,0,i-1, arr[i])){
	                return true;
	            }
	        }        
	        return false;
	}
	static  boolean findDouble(int[] arr, int low, int high , int val){
        if (low> high)
            return false;
        int mid = (low + high)/2;
        if (arr[mid] == val*2 )
            return true;
        if (arr[mid] > val*2)
            return findDouble(arr,low, mid-1,val);
        return findDouble(arr,mid+1,high,val);
    }
}
