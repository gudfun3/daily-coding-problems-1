package com.mwrod.daily.day8;

/**
 * This class represents a node in a tree. 
 */
public class Node<T> {
	private T val;
	private Node<T> left;
	private Node<T> right;
	
	public Node(T val, Node<T> left, Node<T> right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public Node(T val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}

	public T getVal() {
		return val;
	}

	public Node<T> getLeft() {
		return left;
	}

	public Node<T> getRight() {
		return right;
	}
	
	public void setVal(T val) {
		this.val = val;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [val=" + val + ", left=" + left + ", right=" + right + "]";
	}
}
