package com.noor.lambdaexpressions;

public class App {

	public static void main(String args[]) {
		oldWay();
		innerClass();
		anonymousInnerClass();
		ComputerOn cn = lambda();
		cn.on("test",23232);
		
		
		new ComputerOff() {
			public void off() {
				System.out.println("str");
			}
		}.off();;
	}

	private static ComputerOn lambda() {

		ComputerOff co = () ->  {
			System.out.println("hello");
			System.out.println("get out");
		};
		co.off();
		
		
		ComputerOn cn = (str, i) -> System.out.println(str+i);
		
		cn.on("sss",10);
		
		return cn;
		
	}

	private static void anonymousInnerClass() {

		(new ComputerOn() {
			@Override
			public void on(String methodName, int i) {
				System.out.println(methodName + " Eating");
			}
		}).on("anonymous",6);

	}

	private static void innerClass() {
		ComputerOn a = new ComputerOn() {
			@Override
			public void on(String methodName, int i) {
				System.out.println(methodName + " Eating");
			}

		};

		a.on("inner class", 10);

	}

	private static void oldWay() {
		// Animal a = new Giraffe();
		// a.eat("old way");
	}
}
