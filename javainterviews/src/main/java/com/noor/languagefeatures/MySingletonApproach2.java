package com.noor.languagefeatures;

public final class MySingletonApproach2 {

	//At the time of class loading itself singleton is created
	private static MySingletonApproach2 myInstance;
	
	static {
		myInstance = new MySingletonApproach2();
	}
	

	//If we do not supply the private constructor then the public constructor is used by default
	private MySingletonApproach2() {
		System.out.println("constructor called");
	}

	public static MySingletonApproach2 getInstance() {
		return myInstance;
	}

	public void execute() {
		System.out.println("Singleton called");
	}

}
