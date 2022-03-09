import java.util.Arrays;

public class BinarySearchIn2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{23,34,56},{24,37,66},{27,39,76}};
		

		int target=39;
		//int[] ans= searchin2d(arr,target);
		System.out.println(Arrays.toString(searchin2d(arr,target)));

	}

	 static int[] searchin2d(int[][] arr, int target) {
		
		int row=0;
		int col=arr.length-1;
		
			while(row<arr.length && col>=0)//logic is to minimize search space
			{
				if(arr[row][col]==target) {
					return new int[]{row,col};
					
				}
				 if(target>arr[row][col]) {
					row++;//as last element of that row is less than target,other elements in front of i would also be less than target as row wise sorted 
				}
				else {col--;}//if target is less than last element of that row then the whole column can be deleted as elements below it would also be bigger than target
			}
		
		return new int[] {-1,-1};
	}

	
	
    }

