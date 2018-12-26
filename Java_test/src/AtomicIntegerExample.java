import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger(1);
		Runnable t1 = () -> System.out.println("From Thread 1 : "+atomicInteger.incrementAndGet());
		
		Runnable t2 = () -> System.out.println("From Thread 2 : "+atomicInteger.incrementAndGet());
		
		
		new Thread(t1).start();
		new Thread(t2).start();
		
	}

}
