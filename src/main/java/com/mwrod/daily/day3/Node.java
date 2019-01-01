package com.mwrod.daily.day3;

/**
 * This class represents a node in a tree. 
 */
public class Node {
	private String val;
	private Node left;
	private Node right;
	
	public Node(String val, Node left, Node right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public Node(String val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}

	public String getVal() {
		return val;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}
	
	public void setVal(String val) {
		this.val = val;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [val=" + val + ", left=" + left + ", right=" + right + "]";
	}
}
