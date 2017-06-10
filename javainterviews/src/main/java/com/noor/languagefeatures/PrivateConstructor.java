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

	private void execute() {
		System.out.println("Inside execute");
	}

	class PCInnerClass {

		public void execute() {
			//Inner classes are able to access the private methods and constructors of the outer classes.
			PrivateConstructor pv = new PrivateConstructor();
			pv.execute();
		}
	}

}
