//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {1,2,3,4,5,3,1};
int target=6;
int ans=peak(arr,target);
System.out.println(ans);

	}

static int peak(int[] arr,int target) {
	   int start=0;
       int mid=0;
       int end=arr.length-1;
       while(start<end){
           mid=start+(end-start)/2;
           if(arr[mid-1]<arr[mid]&& arr[mid]>arr[mid+1]){
        	   int s2=0;
        	   int e2=mid;
        	   while(s2<=e2) {
        			int mid2= s2+(e2-s2)/2;//this will make sure even if start+end exceeds java limit of int
        		if(target<arr[mid2]) {
        			e2=mid2-1;
        		}
        		if(target>arr[mid2]) {
        			s2=mid2+1;
        		}
        		else return mid2;
        		}
        		
        		
        		int s3= mid+1;
         	   int e3=arr.length-1;
         	   while(s3<=e3) {
         			int mid3= s3+(e3-s3)/2;//this will make sure even if start+end exceeds java limit of int
         		if(target<arr[mid3]) {
         			e3=mid3-1;
         		}
         		if(target>arr[mid3]) {
         			s3=mid3+1;
         		}
         		else return mid3;
         		}
         		return -1;
           }
           if(arr[mid-1]<arr[mid]&& arr[mid]<arr[mid+1]){
               start=mid+1;
           }
            if(arr[mid-1]>arr[mid]&& arr[mid]>arr[mid+1]){
               end=mid;
           }
           
       }return -1;
	}

}
