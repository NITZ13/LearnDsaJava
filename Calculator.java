import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TO find largest among 3 numbers
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		/* if(a>=b && a>=c) {
			System.out.println("largest is "+ a);
		}
		else if(b>=a && b>=c) {
			System.out.println("largest is "+ b);
		}
		else if(c>=b && c>=a) {
			System.out.println("largest is "+ c);
		} */
		
	/*	int max=a;
		if(max<b) {
			max=b;}
		if(max<c) {
			max=c;
		}
			
		System.out.println("largest " +max); */
		int max= Math.max(c,Math.max(a, b));
		System.out.println("largest "+max);
	}

}
