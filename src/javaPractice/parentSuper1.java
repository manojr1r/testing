package javaPractice;

public class parentSuper1 {
public static void main(String[] args) {
	parentSuper1 obj = new parentSuper1();
	ClassPS1 obj1 = new ClassPS1();
	parentSuper obj2 = new parentSuper();
//	obj.methodC1(); childSuper   parentSuper
//	obj1.methodC0();
	obj2.commonMethod();
}

	 
//	class ClassC1 extends ClassC0{
	void methodC1()
		{
			System.out.println("Unique same class method0");
		}
//	}
	void methodC2() 
	{
		System.out.println("Unique same class method1");
	}
}
class  ClassPS1{
	  void methodC0()
		{
			System.out.println("Seperate class method");
		}
	 }