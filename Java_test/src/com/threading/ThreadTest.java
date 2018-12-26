package com.threading;

class LockClass {
	synchronized static void print(int i) {
		synchronized (LockClass.class) {
			for (int j = 1; j < 5; j++) {
				System.out.println(i * j);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}

public class ThreadTest {

	public static void main(String[] args) {
		LockClass obj1 = new LockClass();
		LockClass obj2 = new LockClass();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				obj1.print(10);
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				obj1.print(20);
			}
		};
		Thread t3 = new Thread() {
			@Override
			public void run() {
				obj2.print(100);
			}
		};

		Thread t4 = new Thread() {
			@Override
			public void run() {
				obj2.print(200);
			}
		};
		t1.setPriority(10);
		t2.setPriority(9);
		t3.setPriority(8);
		t4.setPriority(7);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
