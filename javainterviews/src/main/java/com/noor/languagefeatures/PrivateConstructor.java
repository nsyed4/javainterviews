package com.noor.languagefeatures;

public class PrivateConstructor {

	private PrivateConstructor() {
		System.out.println("I am a private Constructor");
	}

	public static void main(String args[]) {

		PrivateConstructor pc = new PrivateConstructor();
		PrivateConstructor.PCInnerClass innerObject = pc.new PCInnerClass();
		innerObject.execute();
		
	}

	public void execute() {
		System.out.println("Inside execute");
	}

	class PCInnerClass {

		public void execute() {
			PrivateConstructor pv = new PrivateConstructor();
			pv.execute();
		}
	}

}
