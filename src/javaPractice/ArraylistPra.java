package javaPractice;

import java.util.ArrayList;

public class ArraylistPra {

	public static void main(String[] args) {
		int a[]= {4,4,5,6,4,5,9};
		ArrayList<Integer> uni = new ArrayList<Integer>();
		int k = 0;
		
		for (int i=0; i< a.length; i++)
		{  k=0;
			if (!uni.contains(a[i]))
			{		
				uni.add(a[i]);
				k++;
			
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j]) {
					k++;
				}
			}
			System.out.println("The value "+a[i]+ " has repated "+k+" times");
			}
		}
		
	}

}
