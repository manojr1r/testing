package demo;

public class ForLoopAssine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for (int i=0;i<4;i++) {
//			System.out.println("outer loop started " +k);
			for (int j=0;j<1+i;j++) {
				System.out.print(+k);
				k++;
				
			}
			System.out.println("");
		}
	}

}
