package com.noor.stack;

public class App {

	public static void main(String args[]) {
		
		String reversed = reverseString("zubair");
		System.out.println(reversed);
		
		
	}
	
	public static String reverseString(String str) {
		
		Stack s = new Stack(str.length());
		int i = 0;
		while(!s.isFull()) {
			s.push(str.charAt(i));
			i++;
		}
		
		StringBuilder sb = new StringBuilder(str.length());
		while(!s.isEmpty()) {
			char c = s.pop();
			sb.append(c);
			i++;
		}
		
		return sb.toString();
		
	}
	
	
}
