import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner in =  new Scanner(System.in); 
		ArrayList<Integer> list= new ArrayList<>();
list.add(1);
list.add(2);

list.add(3);

list.add(100);
System.out.println(list);
System.out.println(list.contains(3));
//add  elements
ArrayList<ArrayList<Integer>> list2= new ArrayList<>();
for(int i=0;i<3;i++) {
	list2.add(new ArrayList<>());
}
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
list2.get(i).add(in.nextInt());
}
	}
System.out.println(list2);
}
}
