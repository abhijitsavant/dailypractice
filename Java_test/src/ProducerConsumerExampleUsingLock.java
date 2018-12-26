
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerExampleUsingLock {
	public static void main(String[] args) throws InterruptedException {
		final PC pc = new PC();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				pc.produce();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				pc.consume();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

	public static class PC {
		Lock lock = new ReentrantLock();
		Condition condition1 = lock.newCondition();
		Condition condition2 = lock.newCondition();
		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 4;

		public void produce() {
			int value = 0;
			while (list.size() != capacity) {
				lock.lock();
				try {
					while (list.size() == capacity) {
						condition1.await();
					}
					System.out.println("Producer produced-" + value);

					list.add(value++);

					condition1.signalAll();

					Thread.sleep(1000);
				} catch (InterruptedException e) {
				} finally {
					lock.unlock();
				}
			}
		}

		public void consume() {
			
			while (list.size() != capacity) {
				lock.lock();
				try {
					while (list.size() == 0) {
						condition2.await();
					}
					int val = list.removeFirst();

					System.out.println("Consumer consumed-" + val);

					condition2.signalAll();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				} finally {
					lock.unlock();
				}
			}
		}
	}
}