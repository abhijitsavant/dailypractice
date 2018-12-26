 class Test{
	 void show() {
			System.out.println("Show1");
		}
	 
	 void show1() {
			System.out.println("Show1");
		}
}
public  class InheritanceTest extends Test{
void show() {
	System.out.println("Show2");
}
	public static void main(String[] args) {
		
		Test t1 = new Test();
		InheritanceTest t2 = new InheritanceTest();
		t1 = (InheritanceTest) t2;
		//t2= null;
		t1.show();
	}
}
