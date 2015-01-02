/**
 * 
 */
package com.github.kanis.list;

import com.github.kanis.list.Node;

/**
 * @author kanis
 *
 */
public class LinkedList<T> {
	private Node<T> head;
	
	public LinkedList() {
		this.head = new Node<T>(null, null);
	}
	
	public LinkedList(T initialValue) {
		Node<T> node = new Node<T>(initialValue, null);
		this.head = new Node<T>(null, node);
	}
	
	public int count() {
		int retVal = 0;
		Node<T> walker = head;
		
		while (walker.getNext() != null) {
			retVal++;
			walker = walker.getNext();
		}
		return retVal;
	}
}
