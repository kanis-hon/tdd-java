/**
 * 
 */
package com.github.kanis.tdd.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sun.org.apache.xpath.internal.operations.Equals;
import com.github.kanis.tdd.linkedlist.Node;

/**
 * @author kanis
 *
 */
public class NodeTest {
	
	private Node node;
	
	@Before
	public void setup() {
		node = new Node();
	}
	
	@Test
	public void testDefaultValue() {
		assertNull(node.getData());
		assertNull(node.getNext());
	}
	
	@Test
	public void testCreateNewNodeThatStoreInteger() {
		Node node = new Node(5);
		assertNotNull(node);
		assertEquals(5, node.getData());
	}

	@Test
	public void testCreateNewNodeNextToExistingNode() {
		Node nextNode = new Node(5);
		
		node.setNext(nextNode);
		assertEquals(node.getNext(), nextNode);
	}
	
	@Test
	public void testUpdateNodeData() {
		node.setData(10);
		assertEquals(10, node.getData());
	}

}
