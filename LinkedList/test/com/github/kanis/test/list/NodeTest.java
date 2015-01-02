/**
 * 
 */
package com.github.kanis.test.list;
import static org.junit.Assert.*;
import org.junit.Test;

import com.github.kanis.list.Node;
/**
 * @author kanis
 *
 */
public class NodeTest {
	@Test
	public void testCreateNodeObject() {
		Node<Integer> node = new Node<Integer>(100, null);
		assertEquals("node value should be equal 100", 100, (int)node.getValue());
		assertNull("next node should be null", node.getNext());
		
		Node<Integer> nodePrev = new Node<Integer>(1, node);
		assertEquals("node value should be equal 1", 1, (int)nodePrev.getValue());
		assertEquals("node object is the next node of nodePrev object", node, nodePrev.getNext());
	}
	@Test
	public void testCreateNodeWithDefaultValue() {
		Node<Integer> node = new Node<Integer>();
		assertNull("node value should be equal null", node.getValue());
		assertNull("next node should be null", node.getNext());
	}
}
