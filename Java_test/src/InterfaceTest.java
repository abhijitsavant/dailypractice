interface Markable1{
	// void display();
}
interface Markable2{
	// void display();
}
interface Markable extends Markable1,Markable2{
	// void display();
}
 class InterfaceTest implements Markable{
	
	public void display() {
		System.out.println("dispaly");
	}
	public static void main(String[] args) {
		System.out.println("hi");
		Markable markable = new InterfaceTest();
		//markable.display(); //not possible
	}

}
