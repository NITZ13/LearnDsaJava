
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {-18,-3,-1,0,2,4,5,66,88,123,555};
int target=123;
int ans=binarySearch(arr,target);
System.out.println(ans);
	}
static int binarySearch(int[]arr,int target) {
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int mid= start+(end-start)/2;//this will make sure even if start+end exceeds java limit of int
	if(target<arr[mid]) {
		end=mid-1;
	}
	if(target>arr[mid]) {
		start=mid+1;
	}
	else return mid;
	}
	return -1;
}
}
