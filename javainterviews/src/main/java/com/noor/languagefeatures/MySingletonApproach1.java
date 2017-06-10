package com.noor.languagefeatures;

public final class MySingletonApproach1 {

	private static MySingletonApproach1 myInstance = null;
	

	//If we do not supply the private constructor then the public constructor is used by default
	private MySingletonApproach1() {
		System.out.println("constructor called");
	}

	public static MySingletonApproach1 getInstance() {
		//What if two threads read myInstance == null at the same time?
		if (myInstance == null) {
			synchronized (MySingletonApproach1.class) {
				myInstance = new MySingletonApproach1();
			}

		}

		return myInstance;
	}

	public void execute() {
		System.out.println("Singleton called");
	}

}
