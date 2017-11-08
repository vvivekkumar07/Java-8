package org.example.java8.interfaces;

public interface PersonInterface {
	
	String getName();
	void setName(String name);
	int getAge();
	void setAge(int age);
	
	
	//default method allows to add an implementaion to a method in interface
	//this method can be called anywhere in the project
	default String getPersonInfo(){
		return getName()+ " " + getAge();
	}
}
