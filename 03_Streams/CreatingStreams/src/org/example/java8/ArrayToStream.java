package org.example.java8;

import java.util.Arrays;
import java.util.stream.Stream;

import org.example.java8.model.Person;

public class ArrayToStream {
	public static void main(String args[]){

		Person[] people = {
				new Person("Joe", 48), 
				new Person("Mary", 30),
				new Person("Mike", 73)};
		/*for (int i = 0; i < people.length; i++) {
			System.out.println(people[i].getInfo());
		}*/
		
		//one way to create an array stream
		Stream<Person> personStream = Stream.of(people);
		personStream.forEach(p -> System.out.println(p.getInfo()));
		
		//another way to create array stream
		Stream<Person> personStream1=Arrays.stream(people);
		personStream1.forEach(p -> System.out.println(p.getInfo()));
	}

}