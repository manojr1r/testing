package javaPractice;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int a[][] = {{4,5,6},{1,2,3}};
		
		
		for (int i = 0; i<2; i++)
		{
			for (int j = 0; j<3; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}

	}

}
