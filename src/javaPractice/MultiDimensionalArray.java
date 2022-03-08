package javaPractice;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int a[][] = {{7,5,6},{56,87,90}};
		int min= a[0][0];
		
		for (int i = 0; i<2; i++)
		{
			for (int j = 0; j<3; j++)
			{
				if (min > (a[i][j]))
				{
					min =(a[i][j]);
				}
				
			}
			
		}
		System.out.println(min);
	}

}
