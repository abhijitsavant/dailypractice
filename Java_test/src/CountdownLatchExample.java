import java.util.concurrent.CountDownLatch;

public class CountdownLatchExample {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(2);
		Runnable t1 = ()->{
			System.out.println("T1");
			//
			try {
				Thread.sleep(2000);
				countDownLatch.countDown();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Runnable t2 = ()->{
			System.out.println("T2");
			countDownLatch.countDown();
		};
		new Thread(t1).start();
		new Thread(t2).start();
		countDownLatch.await();
		
		System.out.println("main.."+countDownLatch.getCount());
	}

}
