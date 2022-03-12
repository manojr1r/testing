package javaPractice;

 public class childSuper{
public static void main(String[] args) {
	ClassC1 cls = new ClassC1();
	cls.methodC1();
 }

void c0Method()
{
	System.out.println("Unique childsuper");
}

public void commonMethod()
{
	System.out.println("common childsuper");
 } 
 }

class  ClassC0{
	 void methodC0()
		{
			System.out.println("parent childsuper");
		}
	 }
	 
	class ClassC1 extends ClassC0{
	public void methodC1()
		{
			System.out.println("Extended childsuper");
		}
	}
 

//  with out extends how parentSuper able to call & create object
//  what will be the out put for parentSuper obj = new childSuper

