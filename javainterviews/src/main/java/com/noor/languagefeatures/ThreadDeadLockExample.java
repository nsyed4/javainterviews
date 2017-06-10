package com.noor.languagefeatures;

public class ThreadDeadLockExample {

	public void methodA() {

		synchronized (Integer.class) {
			System.out.println("Method A acquired lock on Integer Object");
			synchronized (String.class) {
				System.out.println("Method A acquired lock on String Object");
			}
		}

	}

	public void methodB() {

		synchronized (String.class) {
			System.out.println("Method B acquired lock on String Object");
			synchronized (Integer.class) {
				System.out.println("Method B acquired lock on Integer Object");
			}
		}

	}

	public static void main(String args[]) {

		ThreadDeadLockExample td = new ThreadDeadLockExample();

		new Thread(() -> {
			td.methodA();
			td.methodB();
		}).start();

		new Thread(() -> {
			td.methodB();
			td.methodA();
		}).start();

	}

}
