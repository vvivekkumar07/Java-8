package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.java8.model.Person;

public class PredicateLambda {

	public static void main(String args[]) {

		List<Person> people = new ArrayList<>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));

		Predicate<Person> predolder = p -> p.getAge() > 50;
		Predicate<Person> predYoung = p -> p.getAge() <= 30;

		displayPeople(people, predolder);
		displayPeople(people, predYoung);
	}

	private static void displayPeople(List<Person> people, Predicate<Person> pred) {
		people.forEach(p -> {
			if (pred.test(p))
				System.out.println(p);
		});
	}

}