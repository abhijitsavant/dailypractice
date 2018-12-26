
public class ConstructorTest {

	public ConstructorTest() {
		// TODO Auto-generated constructor stub
	}
	public ConstructorTest(String name, Object integer) {
		this(10,"");
		System.out.println("Test1");
		
	}
	
	public ConstructorTest(int integer,String name) {
		System.out.println("Test2");
	}
	
	public void ConstructorTest(char ch, int i) {
		System.out.println(ch+" "+i);
	}
	public void ConstructorTest(char ch, int i, int b) {
		System.out.println(ch+" "+i+" "+b);
	}
	public static void main(String[] args) {
		new ConstructorTest(null,10).ConstructorTest('a', 'A');
	}

}
