
public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
          for(int i=100;i<1000;i++) {
        	  if(isArmstrong(i)) {
        	System.out.print(i + " ");  }
          }
	}
	static boolean isArmstrong(int n) {
		int og=n;
		int sum=0;
		while(n>0) {
		int rem=n%10;
		n=n/10;
		 sum= sum + (rem*rem*rem);
		}
	return sum==og;
		
		
		}
}
	 
	


