import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
 int/*array datatype*/ [] arr = new/*used to create new object memory in heap*/ int[5]/*size*/;
 //in java ARRAY MAY NOT BE STORED IN CONTINOUS FORMAT,
 //IT DEPENDS ON JVM,IF HEAP MEM has contiguous space then contiguous else not
	System.out.println(arr[0]);//initially all array elements are zero
	String[] arr1= new String[5];
	System.out.println(arr1[0]);//initially string array contains null
	int[] arr2=new int[5];
	//System.out.println(arr2.length);
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter 5 elements ");
	//to take input elemnts from user
	//for(int i=0; i<arr2.length;i++) {
		//arr2[i]=sc.nextInt();
	//}
	//to print array elements
	//System.out.println(Arrays.toString(arr2));
	
	//Multi=dimensional ARRAY
	int[][] arr3=new int[3][3]; //row size declaration is mandatory and not column,throwing null pointer exception though
	
	//to take input for 2d array
	for(int row=0;row<arr3.length;row++) {
		//for each col in every row
		for(int col=0;col<arr3[row].length;col++) {
			arr3[row][col]=sc.nextInt();
		}
	}
	for(int row=0;row<arr3.length;row++) {
		//for each col in every row
		for(int col=0;col<arr3[row].length;col++) {
System.out.print(arr3[row][col]+" ");
}System.out.println(" ");
	}
	}
	
 
}
