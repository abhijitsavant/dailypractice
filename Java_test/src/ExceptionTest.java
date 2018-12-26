
public class ExceptionTest {

	public static void main(String[] args) {
		int b = 0;
		try {
			 b = 20/0;
		}catch (ArithmeticException e) {
			e.printStackTrace();
			b = 20/2;
			System.out.println(b);
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("after exception"+b);
	}

}
