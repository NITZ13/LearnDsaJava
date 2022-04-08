import java.util.Arrays;

/*when to use this sorting technique?
 * When input is in RANGE from 1,2,3....,N
 * When the array is sorted, elements will be placed in index element-1 because index starts from 0
 * logic is to swap  element with correct index
 *  */
public class CycleSort {

	public static void main(String[] args) {
		 int [] arr= {5,4,3,2,1,6};
         Cycle(arr);
         System.out.println(Arrays.toString(arr));
	}

	private static void Cycle(int[] arr) {
		     int i=0;//first element
		    while(i<arr.length) {
		    	int correct = arr[i]-1;//that first element's correct index
		    	if(arr[i]!=arr[correct]) 
		    	{
		    		Swap(arr,i,correct);
		    	}
		    	else i++;//if the element at first place is at correct index than increment i
		    }
	}

	private static void Swap(int[] arr, int e1, int e2) {
		int temp=arr[e1];
		arr[e1]=arr[e2];
		arr[e2]=temp;
		
	}

}
