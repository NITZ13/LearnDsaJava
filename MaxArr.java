import java.util.ArrayList;

public class MaxArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,6,5};
		System.out.println(max(arr));

	}
	
static int max(int[] arr) {
	int max=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}return max;
}
}
