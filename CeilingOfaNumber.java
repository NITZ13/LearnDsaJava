
public class CeilingOfaNumber {

	public static void main(String[] args) {
		int target=0;
           int[] arr= {2,23,44,45,48,66,77,100}; //when input sorted always use BINARY SEARCH To get minimum TC
           target=147;
       	int start=0;
    	int end=arr.length-1;
    	if(target>arr[end]) {
    		System.out.println(-1); }
    	
    	while(end>=start){
    		int mid= start + (end-start)/2;
    	if(target>arr[mid]) {
    		start=mid+1;
    	}
    if(target<arr[mid]) {
    		end=mid-1;
    	}
    if(target==arr[mid]) {
    	System.out.println(target); 
    	
    }
    			
    }
    	System.out.println(arr[start]);
           
          // System.out.println(ceil(arr,target));
	}
/*static int ceil(int[] arr,int target)//this does it in O(n)
 *  {
	int val=target;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>=target) {
			val=arr[i];
			break;
		}
		}
	return val;
	
}*/

}
