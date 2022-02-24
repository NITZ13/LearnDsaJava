import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch= sc.next().trim().charAt(0);
		
		if(ch>='a' && ch<='z') {
			System.out.println("Lowercase");
		}
		if(ch>='A' && ch<='Z') {
			System.out.println("Uppercase");
		}
		
		System.out.println(ch);

	}

}
