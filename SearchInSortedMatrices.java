//https://leetcode.com/problems/search-a-2d-matrix/

import java.util.Arrays;
public class SearchInSortedMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,3}};
		

		int target=3;
		//int[] ans= searchin2d(arr,target);
		System.out.println(Arrays.toString(searchin2d(arr,target)));

	}

	 static int[] searchin2d(int[][] arr, int target) {
		
		int row=0;
		int col=arr[0].length-1; //this[0] here is important as if it would not have been mentioned then one testcase where single array with its last elemnt target if passed is unreachable
		
		//block.length // the number of rows
		//block[0].length // the number of columns on row 0
	//	block[1].length // the number of columns on row 1
			while(row<arr.length && col>=0)//logic is to minimize search space
			{
	            
				
				if(arr[row][arr.length]==target){
					return new int[]{row,arr.length};
				}
				
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

