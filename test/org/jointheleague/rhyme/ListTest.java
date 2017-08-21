package org.jointheleague.rhyme;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListTest {

	@Test
	public void testConstructor() {
		LinkedList<String> singly = new LinkedList<>();
		assertTrue(singly.isEmpty());
		assertEquals(0, singly.size());
	}

	@Test
	public void testAddOne() {
		LinkedList<String> singly = new LinkedList<>();
		assertTrue(singly.isEmpty()); // linked list should be empty
		assertEquals(0, singly.size()); // length of linked list should be zero
		singly.addLast("ABC");
		assertFalse(singly.isEmpty()); // linked list should not be empty
		assertEquals(1, singly.size()); // length of linked list should be 1
	}

	@Test
	public void testLinkedListAdd() {
		LinkedList<String> singly = new LinkedList<>();
		singly.addLast("You ");
		singly.addLast("are ");
		singly.addLast("awesome!!");
		assertFalse(singly.isEmpty()); // linked list should not be empty
		assertEquals("You are awesome!!", singly.toString()); // length of linked list should be 1
	}

	@Test
	public void testToStringOnEmptyList() {
		LinkedList<String> singly = new LinkedList<>();
		assertEquals("", singly.toString());
	}

	@Test
	public void testToStringOnIntList() {
		LinkedList<Integer> singly = new LinkedList<>();
		singly.addLast(1);
		singly.addLast(0);
		singly.addLast(0);
		assertEquals("100", singly.toString());
	}

	@Test
	public void testAdd() {
		LinkedList<String> singly = new LinkedList<>();
		singly.addLast("First ");
		singly.addLast("Third");
		singly.add("Second ", 1);
		assertEquals("First Second Third", singly.toString());
	}

	@Test
	public void testIndexOutOfBounds() {
		LinkedList<Integer> singly = new LinkedList<>();
		singly.addLast(1);
		singly.addLast(0);
		singly.addLast(0);
		try {
			singly.add(23984, 239857);
			assertTrue(false);
		} catch (ArrayIndexOutOfBoundsException e) {

		}

	}
	
	@Test
	public void testAddToEmptyList() {
		LinkedList<String> singly = new LinkedList<>();
		singly.add("text", 0);
		assertEquals("text", singly.toString());
	}

}
