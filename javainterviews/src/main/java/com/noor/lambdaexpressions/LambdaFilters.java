package com.noor.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaFilters {

	public static void main(String args[]) {

		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person(18, "p1", null));
		persons.add(new Person(72, "p2", null));
		persons.add(new Person(36, "p3", null));

		// Predicate
		persons.forEach(p -> System.out.println(p.getAge()));

		Predicate<Person> myPredicate = new Predicate<Person>() {
			@Override
			public boolean test(Person p) {
				return p.getAge() < 65;
			}
		};
		
		Predicate<Person> lPredicate = (p) -> {  return (p.getAge() < 65); };
		Predicate<Person> rPredicate = (p) -> {  return (p.getAge() > 65); };
		

		persons.forEach(p1 -> System.out.println(p1.getName()+"--->"+lPredicate.test(p1)));
		System.out.println(" ");
		persons.forEach(p1 -> System.out.println(p1.getName()+"--->"+rPredicate.test(p1)));


	}

}
