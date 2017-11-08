package com.example.java8;

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class StringJoinerClass {

	public static void main(String[] args) {

		// Creating a StringJoiner
		StringJoiner strjoin = new StringJoiner(",", "{", "}");
		strjoin.setEmptyValue("No values yet");
		System.out.println(strjoin);
		strjoin.add("Vivek").add("adhi").add("Kohila");
		System.out.println(strjoin);

		// Merging StringJoiner instances
		StringJoiner strmerge = new StringJoiner(",");
		strmerge.add("Vijay");
		strjoin.merge(strmerge);
		System.out.println(strjoin);
		// check this-- no prefix and suffix will come because strmerge doesn't
		// have the prefix and suffix initialized
		strmerge.merge(strjoin);
		System.out.println(strmerge);

		// Working with collections
		Set<String> set = new TreeSet<>();
		set.add("California");
		set.add("Oregon");
		set.add("Washington");
		
		StringJoiner strjoiner= new StringJoiner(",");
		set.forEach(s->strjoiner.add(s));
		System.out.println(strjoiner);

	}

}
