package com.alessandrodias.javafundamentals.part03;

public class Dog extends Animal{
	
	@Override
	public void speak() {
		voice = "woof";
		super.speak();
	}

}
