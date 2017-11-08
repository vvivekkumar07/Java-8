package com.example.javase8;

import com.example.javase8.interfaces.InterfaceWithArgs;

public class UseInterfaceWithArgs {

	public static void main(String[] args) {
		InterfaceWithArgs args1=(a,b)-> {
			int result= a+b;
			System.out.println(result);
		};
		args1.doSomething(10,5);
	}

}
