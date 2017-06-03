package com.noor.languagefeatures;

public class MySingletonClient {
	
	public static void main(String args[]) {
		
		
		MySingletonApproach1 mySingleton;
		mySingleton= MySingletonApproach1.getInstance();
		mySingleton.execute();
		
		
		MySingletonApproach2 mySingleton2;
		mySingleton2 = MySingletonApproach2.getInstance();
		mySingleton2.execute();
	}

}
