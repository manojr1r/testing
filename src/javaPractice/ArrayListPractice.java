package javaPractice;
import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();   //
		ArrayList<String> a2  = new ArrayList<String>();
		
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(3,4);
		a1.add(null);
		
		a1.remove(2);//added value of 3rd index automatically moves above
		System.out.println(a1.get(2)+" by get method");

		for (int i=0; i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println("lets try other way");
		int j=a1.size();
		System.out.println(j);
		for (int k=a1.size()-1; k>=0;k--) {
		System.out.println(a1.get(k));

	}
	}
}
