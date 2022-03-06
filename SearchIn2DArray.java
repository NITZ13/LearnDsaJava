import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{1,2,3},
				{3,4,5}, 
				{67,8,9,0}
		};
		int target=0;
		System.out.println("enter the target element you want to search in 2d array ");
		Scanner sc=new Scanner(System.in);
		target=sc.nextInt();
		int[] ans=search(arr,target);//we are returning the index at which the element is found
		System.out.println("elemnt found at index " +Arrays.toString(ans));
	}
	static int[] search(int[][]arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(target==arr[row][col]) {
					return new int[] {row,col};
				}
			}
		}return new int[] {-1,-1};//here we creating new array object to return
	}
		
	}
	
