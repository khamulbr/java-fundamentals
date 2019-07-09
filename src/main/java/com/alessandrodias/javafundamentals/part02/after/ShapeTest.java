package com.alessandrodias.javafundamentals.part02.after;

import java.util.Arrays;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.facing = 180;
		circle1.rotate();
		circle1.playSound();
		List<String> list = Arrays.asList("Buenos Aires", "Córdoba", "La Plata");
		
		list.stream().forEach((c) -> System.out.println(c));
		
		 
	}
}
