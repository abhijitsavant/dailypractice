import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CyclicBarrier barrier = new CyclicBarrier(3);
		ExecutorService executer = Executors.newFixedThreadPool(3);
		Callable<String> t1 = ()->{
			try {
				barrier.await();
				Thread.sleep(2000);
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println("Thread name : "+Thread.currentThread().getName());
			return "executed : "+Thread.currentThread().getName();
		};
		barrier.reset();
		executer.submit(t1);
		executer.submit(t1);
		executer.submit(t1);
		/*String string1 = executer.submit(t1).get();
		String string2 = executer.submit(t1).get();
		String string3 = executer.submit(t1).get();
		System.out.println(string1+" "+string2+" "+string3);*/
	}

}
