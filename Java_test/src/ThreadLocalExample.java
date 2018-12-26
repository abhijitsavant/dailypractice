class MyThreadLocal extends ThreadLocal<String>{
	@Override
	protected String initialValue() {
		return "Initial value";
	}
}
public class ThreadLocalExample {

	public static class MyRunnable implements Runnable {

		private ThreadLocal<String> threadLocal = new MyThreadLocal();

		@Override
		public void run() {
			threadLocal.set("this is my thread name : "+Thread.currentThread().getName());

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

			System.out.println(threadLocal.get());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyRunnable sharedRunnableInstance = new MyRunnable();

		Thread thread1 = new Thread(sharedRunnableInstance);
		Thread thread2 = new Thread(sharedRunnableInstance);

		thread1.start();
		thread2.start();

		thread1.join(); // wait for thread 1 to terminate
		thread2.join(); // wait for thread 2 to terminate
	}

}