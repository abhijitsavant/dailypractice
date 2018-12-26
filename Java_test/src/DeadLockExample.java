import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadLock {

}

public class DeadLockExample {

	public static void main(String[] args) {
		String resource1 = "Abhi";
		String resource2 = "Savant";

		/*Thread thread1 = new Thread() {
			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: locked resource 1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (resource2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
		};
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2: locked resource 2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (resource1) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
		};
		
		thread1.start();
		thread2.start();*/
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		Thread thread3 = new Thread() {
			@Override
			public void run() {
				
				lock1.lock();
					System.out.println("Thread 1: locked resource 1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}finally {
						lock1.unlock();
					}

					lock2.lock();
						System.out.println("Thread 1: locked resource 2");
					
				
			}
		};
		
		Thread thread4 = new Thread() {
			@Override
			public void run() {
				
				lock2.lock();
					System.out.println("Thread 2: locked resource 2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}finally {
						lock2.unlock();
					}


					lock1.lock();
						System.out.println("Thread 2: locked resource 1");
					
				}
		};
		
		thread3.start();
		thread4.start();
	}

}
