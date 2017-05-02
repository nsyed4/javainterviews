package com.noor.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ComparatorApp {

	public static void main(String args[]) {

		List<String> strings = new ArrayList<>();

		strings.add("AAA");
		strings.add("BBB");
		strings.add("aaa");
		strings.add("bbb");
		strings.add("DDD");

		System.out.println("Simple Sort:");
		try{
		Collections.sort(strings);
		}catch(Exception e) {
			//continue
		}
		System.out.println(strings);
		System.out.println("--------------");

		System.out.println("Comparator Sort:");
		Collections.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareToIgnoreCase(o2);
				
			}

		});
		System.out.println(strings);
		System.out.println("-----------------");

		
		System.out.println("Lambda Sort:");
		Collections.sort(strings, (String s1, String s2) -> {
			return s1.compareToIgnoreCase(s2);
		});

		System.out.println(strings);
		System.out.println("-----------------");
		
		/*System.out.println("Using Iterator");
		//Iterate with iterator
		Iterator<String> i = strings.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("-----------------");
		
		System.out.println("Using Consumer");
		//Instead of iterating with iterator, we can iterate using for each loop
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				
				System.out.println(t.toLowerCase());
				
			}
			
		};
		
		
		strings.forEach(consumer);
		System.out.println("-----------------");
*/
		
		strings.forEach(str -> System.out.println(str.toLowerCase()));
		
		
		Runnable r = () -> {
			System.out.println("Running Thread...");
		};

		new Thread(r).start();
	}

}
