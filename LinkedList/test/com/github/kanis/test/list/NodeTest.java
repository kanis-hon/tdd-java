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
	public void shouldReturnNodeData() {
		Node<Integer> node = new Node<Integer>(100);
		assertEquals(100, (int)node.getValue());
		assertNull(node.getNext());
	}
}
