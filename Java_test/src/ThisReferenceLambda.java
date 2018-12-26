
public class ThisReferenceLambda {
	
	void testMove1(int i, Movable movable) {
		movable.move();
	}

	 void executeTest(int i) {
		 testMove1(i, ()->{System.out.println(this);});
	}
	 
	 @Override
	public String toString() {
		return "This is ThisReferenceLambda class";
	}
	 
	public static void main(String[] args) {
		ThisReferenceLambda referenceLambda = new ThisReferenceLambda();
		int a = 10;
		referenceLambda.executeTest(a);
		/*referenceLambda.testMove1(a, new Movable() {
			
			@Override
			public void move() {
				System.out.println(a);
				System.out.println(this);
			}
			
			@Override
			public String toString() {
				return "This is Anonymous class";
			}
		});*/
	}

}


interface Movable{
	void move();
}