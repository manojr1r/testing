package javaPractice;

 public class childSuper extends parentSuper{
public static void main(String[] args) {
	
	childSuper.c1Method();    //is a static method so can call directly from class 
	
	childSuper objSelf = new childSuper();
	objSelf.c0Method();			//will create an object for class to call methods of own class 
	objSelf.commonMethod();  
	objSelf.c1Method();     //also can call static keyword
	ClassC1 cls = new ClassC1();
	cls.methodC1();
 }

void c0Method()
{
	System.out.println("Unique method of childsuper");
}
static void c1Method()
{
	System.out.println("Unique Static childsuper");
}

public void commonMethod()
{
	System.out.println("common method of childsuper");
 } 
 }

class  ClassC0{
	int i=0;
	 static void methodC0()
		{
			System.out.println("parent childsuper");
		}
	 }
	 
	class ClassC1 extends ClassC0{
	public void methodC1()
		{
			System.out.println("method of ClassC1 Extended of ClassC0");
		}
	
	}
	
	 class parentSuper extends ClassC1{
			
			public void P0Method()
			{
				System.out.println("Unique parent Super class");
			}
			public void commonMethod()
			{
				System.out.println("common method of parentSuper");
			 } 
			
	 }

//  with out extends how parentSuper able to call & create object
//  what will be the out put for parentSuper obj = new childSuper

