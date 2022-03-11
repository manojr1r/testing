package javaPractice;

public class parentSuper extends childSuper{
	
	public void P0Method()
	{
		System.out.println("Unique parent Super class");
	}
	
	public void commonMethod()
	{
		System.out.println("common parent Super class");
	}

	public static void main(String[] args) {
		parentSuper obj = new parentSuper();
		obj.commonMethod();
		}

}
