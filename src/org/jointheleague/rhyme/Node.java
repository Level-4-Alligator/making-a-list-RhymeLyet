package org.jointheleague.rhyme;

/*

 *  Java Program to Implement Singly Linked List

 */

import java.util.Scanner;

/*  Class Node  */
class Node <T> {
	protected T data;
	protected Node<T> next;

	/* Constructor */
	public Node() {
		next = null;
		data = null;
	}
	
	public Node(T d) {
		next = null;
		data = d;
	}

	/* Constructor */
	public Node(T d, Node<T> n) {
		data = d;
		next = n;
	}

	/* Function to set link to next Node */
	public void setNext(Node<T> n) {
		next = n;
	}

	/* Function to set data to current Node */
	public void setData(T d) {
		data = d;
	}

	/* Function to get link to next node */
	public Node<T> getNext() {
		return next;
	}

	/* Function to get data from current Node */
	public T getData() {
		return data;
	}
}
