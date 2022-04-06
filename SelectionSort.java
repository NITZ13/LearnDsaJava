import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr= {5,10,8,2,4,3};
         Selection(arr);
         System.out.println(Arrays.toString(arr));
	}
//here we will run loop to place max element at last index and so on
	private static void Selection(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int lastIndex=arr.length-i-1;//for i=0,1 last index would be n-1, n-2
			int max= getMaxIndex(arr,0,lastIndex);//which index element is max
			swap(arr,lastIndex,max);//swap max with last index
		}
		
	}

	private static int getMaxIndex(int[] arr, int start, int end) {
		int max=start;
		for(int i=start;i<=end;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}
	
	public static void swap(int[] arr,int e1,int e2) {
		int temp=arr[e1];
		arr[e1]=arr[e2];
		arr[e2]=temp;
			} 

}
