package com.qa.testdrivendevelopment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test file for Questions Class.
 * 
 * The first questions have been completed for you, 
 * there are 10 other questions.
 * 
 * Run this file to see how well you are doing.
 * 
 * DO NOT EDIT THIS FILE!
 * 
 * An extra test (which is secret) will run on these tests after submission
 * So it is not recommended that you "hard code" solutions.
 * i.e. if (input.equals("John")) return "Hi John"
 * 
 */
public class QuestionTest {

	private Questions questions = new Questions();	
	
	@Test
	public void greetingExampleTest() {
		assertEquals("Hi John", questions.greetingExample("John"));
		assertEquals("Hi Matt", questions.greetingExample("Matt"));
		assertEquals("Hi Angelica", questions.greetingExample("Angelica"));		
	}
	
	@Test
	public void multiCharTest() {
		assertEquals("TTThhheee", questions.multiChar("The"));
		assertEquals("AAAAAAbbbbbb", questions.multiChar("AAbb"));
		assertEquals("HHHiii---TTThhheeerrreee", questions.multiChar("Hi-There"));
	}
	
	@Test
	public void sandwichFillingTest() {
		assertEquals("evilc", questions.sandwichFilling("breadclivebread"));
		assertEquals("egdirf", questions.sandwichFilling("xxbreadfridgebreadyy"));
		assertEquals("egdirf", questions.sandwichFilling("xxBreadfridgeBReAdyy"));
		assertEquals("", questions.sandwichFilling("xxbreadyy"));
		assertEquals("", questions.sandwichFilling("xxbreADyy"));
	}
	
	@Test
	public void evenlySpacedTest() {
		assertTrue(questions.evenlySpaced(2, 4, 6));
		assertTrue(questions.evenlySpaced(4, 6, 2));
		assertFalse(questions.evenlySpaced(4, 6, 3));
		assertFalse(questions.evenlySpaced(4, 60, 9));
	}
	
	@Test
	public void nMidTest() {
		assertEquals("Ho", questions.nMid("Hello", 3));
		assertEquals("Choate", questions.nMid("Chocolate", 3));
		assertEquals("Choclate", questions.nMid("Chocolate", 1));
	}
	
	@Test
	public void endsJavaTest() {
		assertTrue(questions.endsJava("ilovejava"));
		assertTrue(questions.endsJava("iloveJaVa"));
		assertTrue(questions.endsJava("welovejava"));
		assertFalse(questions.endsJava("welovejavamoreeveryday"));
		assertFalse(questions.endsJava("javaiscool"));
		assertFalse(questions.endsJava("pythoniscool"));
	}
	
	@Test
	public void superBlockTest() {
		assertEquals(3, questions.superBlock("hooopplla"));
		assertEquals(4, questions.superBlock("abbCCCddDDDDeeEEE"));
		assertEquals(5, questions.superBlock("abbCCCCC"));
		assertEquals(0, questions.superBlock(""));
	}
	
	@Test
	public void amISearchTest() {
		assertEquals(1, questions.amISearch("Am I in Amsterdam"));
		assertEquals(2, questions.amISearch("I am in Amsterdam am I?"));
		assertEquals(0, questions.amISearch("I have been in Amsterdam"));
	}
	
	@Test
	public void fizzBuzzTest() {
		assertEquals("fizz", questions.fizzBuzz(3));
		assertEquals("buzz", questions.fizzBuzz(10));
		assertEquals("fizzbuzz", questions.fizzBuzz(15));
		assertNull(questions.fizzBuzz(8));
	}
	
	@Test
	public void largestTest() {
		assertEquals(14, questions.largest("55 72 86"));
		assertEquals(11, questions.largest("15 72 80 164"));
		assertEquals(15, questions.largest("555 72 86 45 10"));
	}
	
	@Test
	public void comparesTest() {
		assertTrue(questions.compares("The", 2, 'h'));
		assertFalse(questions.compares("AAbb", 1, 'b'));
		assertFalse(questions.compares("Hi-There", 10, 'e'));
	}
	
}












