package com.noor.amazon;

import java.util.Stack;

public class MatchingBraces {
	
	private static String OPENING_BRACES = "{[(";
	private static String CLOSING_BRACES = "}])";
	private static String SPACE = " ";
	public static void main(String args[]) {
		//INPUT : Through command line: { [ ] ( ) }
		//OUTPUT: On commandline
		
		boolean answer = bracesMatched("{ [ ] (  ) }", SPACE);
		System.out.println(answer);
	}
	
	public static boolean bracesMatched(String braces, String delimeter) {
		if(braces == null)
			return false;
		if(braces.equals(""))
			return false;
		
		
		String bracesArr[] = braces.split(SPACE);
		Stack<String> stack = new Stack<String>();
		boolean matched=false;
		for(String str:bracesArr) {
			if(OPENING_BRACES.contains(str)) {
				stack.push(str);
			}
			
			if(CLOSING_BRACES.contains(str)) {
				String popped = stack.pop();
				if((str.equals("}") && popped.equals("{")) || 
						(str.equals("]") && popped.equals("[")) ||
						(str.equals(")") && popped.equals("("))) {
					
					matched = true;
				}else{
					return false;
				}
				
			}
				
		}
		
		return matched;
	}

}
