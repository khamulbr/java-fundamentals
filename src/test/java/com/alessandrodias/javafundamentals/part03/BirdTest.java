package com.alessandrodias.javafundamentals.part03;

import static org.junit.Assert.*;

import org.junit.Test;

public class BirdTest {

	@Test
	public void itShouldChirp() {
		Bird bird1 = new Bird();
		bird1.speak();
		assertEquals("chirp", bird1.voice);
	}

}
