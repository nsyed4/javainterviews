package com.noor.languagefeatures;

public class MySingletonApproach3 {

	// At the time of class loading itself singleton is created
	private static MySingletonApproach3 myInstance;
	private static Object mutex = new Object();

	// If we do not supply the private constructor then the public constructor
	// is used by default
	private MySingletonApproach3() {
		System.out.println("constructor called");
	}

	public static MySingletonApproach3 getInstance() {

		if (myInstance == null) {
			synchronized (mutex) {
				if (myInstance == null) {
					myInstance = new MySingletonApproach3();
				}
			}
		}
		return myInstance;
	}

	public void execute() {
		System.out.println("Singleton called");
	}

}
