import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		 int [] arr= {5,10,8,2,4,3};
         Insertion(arr);
         System.out.println(Arrays.toString(arr));
	}
//in insertion sort idea is to sort lhs, that is make lhs in ascending order
	//this is better than bubble sort as it lessens the number of swaps required as lhs keeps getting sorted
	private static void Insertion(int[] arr) {
		for(int i=0;i<arr.length-1;i++) //loop will run till i=arr.length-2 because at max j=i+1
		{
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) //if prev element greater than current element then swap
				{
					swap(arr,j,j-1);
				}
				else break;//else break because no need to search further more in lhs as sorted
			}
		}
		
	}
	
	public static void swap(int[] arr,int e1,int e2) {
		int temp=arr[e1];
		arr[e1]=arr[e2];
		arr[e2]=temp;
			} 

}
