import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int p=0;
		int i=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		 n=sc.nextInt();
		 for(int j=2;j<=n;j++) {
			int temp=i;
			i=i+p;
			p=temp;
			  
		 }
		 
System.out.println(i);
	}



}