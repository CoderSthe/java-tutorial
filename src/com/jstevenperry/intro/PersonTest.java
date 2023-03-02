package com.jstevenperry.intro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	public void testPerson() {
		
		Person p = new Person("Joe", "Author", 42, 173, 82, "Brown", "MALE");
		
//		Logger l = Logger.getLogger(Person.class.getName());
		Logger l = Logger.getLogger(Person.class.getName());
		l.info("Created Person object named: " + p.getFullName());
		
		assertEquals("Joe Author", p.getFullName());
		assertEquals(42, p.getAge());
		assertEquals(175, p.getHeight());
		assertEquals(82, p.getWeight());
		assertEquals("Brown", p.getEyeColor());
		assertEquals("MALE", p.getGender());
	}

}
