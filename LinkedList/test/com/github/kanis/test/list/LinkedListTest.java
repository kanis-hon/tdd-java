/**
 * 
 */
package com.github.kanis.test.list;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.kanis.list.LinkedList;

/**
 * @author kanis
 *
 */
public class LinkedListTest {
	@Test
	public void testCreateEmptyLinkedListObject() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertEquals("node count in an empty list should be zero", 0, list.count());
	}
	
	@Test
	public void testCreateLinkedListObjectWithInitialNode() {
		//Node<Integer> node = new Node<Integer>(100);
		LinkedList<Integer> list = new LinkedList<Integer>(100);
		assertEquals("node count should be one", 1, list.count());
	}
}
