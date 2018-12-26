
public class LambdaExpression {

	public static void main(String[] args) {
		StringLength stringLength = ( s) -> s.length();
		System.out.println(stringLength.getLength("Abhijit"));
		
		StringLength length = new StringLength() {
			
			@Override
			public int getLength(String string) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			/*@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}*/
		};
		
		Thread thread = new Thread(()->System.out.println("This is thread lambda expression"));
		thread.run();
	}

}

interface StringLength{
	int getLength(String string);
	//void display();
}
