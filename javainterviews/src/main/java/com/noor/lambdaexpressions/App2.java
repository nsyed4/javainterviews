package com.noor.lambdaexpressions;

public class App2 {

	public static void main(String args[]) {

		innerClass();
		anonymousClass();
		
		

	}

	private static void anonymousClass() {

		(new ComputerOff() {

			@Override
			public void off() {
				System.out.println("off");
			}

		}).off();

	}

	private static void innerClass() {

		ComputerOff co = new ComputerOff() {

			@Override
			public void off() {
				System.out.println("off");
			}
		};

		co.off();

	}

}
