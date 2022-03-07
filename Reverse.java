import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		 int n=sc.nextInt();
		 int ans=0;
		 //my method
		/* while(n>0) {
			int a=n%10; 
			System.out.print(a);
			n=n/10;
		 }*/
		 //kunal method
		 while(n>0) {
			 int rem= n%10;
			 n=n/10;
			  ans= ans *10 + rem;
		 }System.out.println(ans);
	}

}
