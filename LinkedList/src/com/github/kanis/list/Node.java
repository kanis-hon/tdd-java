/**
 * 
 */
package com.github.kanis.list;

/**
 * @author kanis
 *
 */
public class Node<T> {
	private T value;
	private Node<T> next;
	
/*	public Node(T value) {
		this(value, null);
	}
	public Node(Node<T> next) {
		this(null, next);
	}*/
	public Node() {
		this(null, null);
	}
	public Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}
	
	
	public Node<T> getNext() {
		return this.next;
	}
	public T getValue() {
		return this.value;
	}
}
