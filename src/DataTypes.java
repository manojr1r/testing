
public class DataTypes {

	public static void main(String[] args) {
		
		int i =1;
		int i1=i;
		i =2;
//		System.out.println(i);
//		System.out.println(i1); //even i value changed i1 will not be changes but this diff to String data type
		
		
		
		
		
		
		//String is an object that represents sequence of objects 
		
		//with String Literal
		String s ="hello world";
		String s1 ="hello world";   //will create one memory allocation (as both are of same value) for both objects map to the one 
		String splitS ="hello o world";
		
		//with new keyword
		String s2= new String("hello world");
		String s3 = "hello";
		
//		System.out.println(s ==(s1));
//		System.out.println(s == (s2)); // How to check memory location of a string?
//		System.out.println(s.equals(s2));
//		System.out.println(s.matches(s2));  
//		System.out.println(s.equals(s3));
		String[] splitSt1 = splitS.split("o"); // will it split for every position where O present?
		System.out.println(splitSt1.length);
		System.out.println(splitSt1[0]);
		System.out.println(splitSt1[1]);
		System.out.println(splitSt1[2]);

//		for (int j =s.length()-1; j>=0; j--)//reverse order
//		{
//		System.out.println(s.charAt(j));
//		}
		
	}
		
}
      

