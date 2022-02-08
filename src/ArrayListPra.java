import java.util.ArrayList;

public class ArrayListPra {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();   //
		ArrayList<String> a2  = new ArrayList<String>();
		
		
		a1.add(1);
		a1.add(2);
		
//		System.out.println(int k=a1.size());
		for (int i=0; i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println("lets try other way");

		for (int j=a1.size(); j<a1.size();j--) {
		System.out.println(a1.get(j));

	}
	}
}
