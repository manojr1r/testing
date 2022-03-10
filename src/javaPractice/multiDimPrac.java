package javaPractice;

public class multiDimPrac {

	public static void main(String[] args) {
		int a[][] = {{-1,-5,2},{56,25,90},};
		int min=a[0][0];
		int minCol=0;
		for (int i =0;i<2;i++)
		{
			for (int j =0;j<3;j++)
			{
				if (a[i][j]<min)
				{
					min=a[i][j];
					minCol=j;
					
				}
			}
		}
		int maxInCol = 0;
		/*for (int k =0;k<2;k++)
		{
			if(a[k][minCol]>maxInCol)
			{
				maxInCol= a[k][minCol];
			}
			
		}*/
		
//		with while loop
		int k=0;
		while (k<2)
		{
			if (a[k][minCol]>maxInCol)
			{
				maxInCol = a[k][minCol];
			}
			k++;
		}
		
		System.out.println(maxInCol);

	}

}
