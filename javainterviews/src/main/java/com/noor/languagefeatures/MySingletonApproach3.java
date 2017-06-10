package com.noor.languagefeatures;

public class MySingletonApproach3 {

	private static MySingletonApproach3 myInstance;
	private static Object lock = new Object();

	private MySingletonApproach3() {
	}

	public static MySingletonApproach3 getInstance() {
		//This ic called doublecheck locking because we are checking if myInstance == null twice
		if (myInstance == null) {
			synchronized (lock) {
				if (myInstance == null) {
					myInstance = new MySingletonApproach3();
				}
			}
		}

		return myInstance;
	}

	
	public void execute() {
		System.out.println("Singleton");
	}
}