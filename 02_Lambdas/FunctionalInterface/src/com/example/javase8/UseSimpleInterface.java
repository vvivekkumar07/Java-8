package com.example.javase8;

import com.example.javase8.interfaces.SimpleInterface;

public class UseSimpleInterface {

	public static void main(String[] args) {
		//Using lambda expression
		SimpleInterface obj= ()->System.out.println("saysomething");
		obj.doSomething();

	}

}
