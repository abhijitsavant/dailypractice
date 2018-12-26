package com.threading;

public class DeadLock {

	public static void main(String[] args) {
		String str1 = "1";
		String str2 = "2";
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				synchronized (str1) {
					System.out.println("Thread 1 str1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}
					System.out.println("Thread 1 trying second lock");
					synchronized (str2) {
						System.out.println("Thread 1 str2");
					}
				}
				
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				synchronized (str2) {
					System.out.println("Thread 2 str2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}
					System.out.println("Thread 2 trying second lock");
					synchronized (str1) {
						System.out.println("Thread 2 str1");
					}
				}
				
			}
		};
		t1.start();
		t2.start();
	}

}
