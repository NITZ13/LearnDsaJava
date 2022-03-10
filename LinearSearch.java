import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,6,55,77,33,22,88,5,5};
		int n=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter which number you want to search " );
		n=sc.nextInt();
		search(arr,n);
 
	}
static int search(int[] arr,int n) {
	int j=0;
	while(j<arr.length) {
		if (arr[j]== n) {
			System.out.println("Match found at index " +j);
			return j;
		} else j++;
	}
	System.out.println("Match not found to "+n);
	return n;
}
}
