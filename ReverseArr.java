import java.util.Arrays;

public class ReverseArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,6,5};
System.out.println(Arrays.toString(arr));
 reverse(arr);
 System.out.println("after reverse " +Arrays.toString(arr));
	}
	static void reverse(int[] arr)
	{int start=0;
	int end=arr.length-1;
	while(start<end) {
		int temp=arr[end];
		arr[end]=arr[start];
		arr[start]=temp;
		start++;
		end--;
	}
	}

}
