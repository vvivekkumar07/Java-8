package com.example.java8;

public class JoinerMethod {

	public static void main(String[] args) {
		
		//joing strings-first argument takes the value as delimiter and next take the valus of string.
		//it takes multiple parameter
		String str= String.join(" and ", "Vivek","Adhi");
		System.out.println(str);
		
		//working with array of strings
		String[] strArray= {"Tamilnadu","kerala"};
		String statelist=String.join(",", strArray);
		System.out.println(statelist);

	}		
}
