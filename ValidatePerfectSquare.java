//https://leetcode.com/problems/valid-perfect-square/
public class ValidatePerfectSquare {

	public static void main(String[] args) {
		class Solution {
		    public boolean isPerfectSquare(int num) {
		        int num1=num;
		        long start=0;
		        long end= num1;
		        while(start<=end){
		    long mid=start+(end-start)/2;
		            long sqr=mid*mid;
		            if(sqr==num1){
		                return true;
		            }
		            if(sqr<num1){
		                start=mid+1;
		                
		            }
		            else end=mid-1;
		        }
		  return false;  
		    }
		}
	}

}
