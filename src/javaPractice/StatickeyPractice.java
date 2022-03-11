package javaPractice;

public class StatickeyPractice {

	static int i;
	
	
	static{
		i=0;
	}
	

public static int OneClass() {
	int j =5;
	return j;
	
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println(StatickeyPractice.i);
	System.out.println(StatickeyPractice.OneClass());

}

}