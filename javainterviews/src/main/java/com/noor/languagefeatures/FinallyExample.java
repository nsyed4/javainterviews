package com.noor.languagefeatures;

public class FinallyExample {

	public static void main(String args[]) {
		FinallyExample fe = new FinallyExample();
		System.out.println(fe.callDivide(5,1));
		System.out.println(fe.callDivide(5,0));
	}

	private String callDivide(int x, int y) {

		try {
			int z = x / y;
			System.out.println("returning " + z);
			return "returnings " + z;

		} catch (Exception e) {
			System.out.println("return divide by zero error ");
			return "returns divide by zero error ";
		} finally {
			System.out.println("I will execute regardless");
		}

	}

}
