//LEETCODE EASY QUES:Given an array of integers return how many of them contain even number of digits
public class EvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {555,901,482,1771};
		System.out.println(EvenDig(arr));

	}
static int EvenDig(int[] arr) {			
	int c=0;

	for(int i=0;i<arr.length;i++) {
		int count=0;
		if(arr[i]<0)//edge case when  number is negative 
		{
			arr[i]=arr[i]*-1;
		}
		/*while(arr[i]>0) {
			arr[i]=arr[i]/10;
			count++;
		
		}*/
		count= (int)(Math.log10(arr[i])+1);
		if(count%2==0) {
			c++;
		
}
	}
	return c;
}
}
//took 3ms and optimized takes 1ms without func