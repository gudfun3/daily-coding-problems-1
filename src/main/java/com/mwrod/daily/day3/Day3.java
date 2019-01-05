package com.mwrod.daily.day3;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Problem: Given the root to a binary tree, implement serialize(root), 
 * 	which serializes the tree into a string, and deserialize(s), 
 * 	which deserializes the string back into the tree.
 * 
 * Example: Given the following Node class
 * 
 * 	class Node:
 *     	def __init__(self, val, left=None, right=None):
 *         	self.val = val
 *         	self.left = left
 *         	self.right = right
 * 
 * 	The following test should pass:
 * 
 * 	node = Node('root', Node('left', Node('left.left')), Node('right'))
 * 	assert deserialize(serialize(node)).left.left.val == 'left.left'
 *
 */
public class Day3 {

	/**
	 * Serializes a binary tree (given by {@code root}) into a string.
	 * 
	 * @param root Root node of binary tree
	 * @return Serialized tree
	 */
	public String serializeBinaryTree(Node root) {
		String s = root.getVal() + " ";
		
		if(root.getLeft() == null) {
			s += "* ";
		} else {
			s += serializeBinaryTree(root.getLeft());
		}

		if(root.getRight() == null) {
			s += "* ";
		} else {
			s += serializeBinaryTree(root.getRight());
		}
		
		return s;
	}
	
	/**
	 * Deserializes a binary tree, which is serialized by {@code treeStr}.
	 * 
	 * @param treeStr Serialized binary tree
	 * @return Binary tree
	 */
	public Node deserializeBinaryTree(String treeStr) {
		// split serialized string to a list and get iterator
		Iterator<String> iterNodeVal = Arrays.asList(treeStr.split(" ")).iterator();
		
		// run deserialization with iterator recursively
		return deserialize(treeStr, iterNodeVal);
	}
	
	private Node deserialize(String treeStr, Iterator<String> iter) {
		// get next value from iterator
		String val = iter.next();
		
		// if marker is reached then return null as node
		if(val.equals("*")) return null;
		
		// deserialize left node till marker and then right node
		return new Node(val, deserialize(treeStr, iter), deserialize(treeStr, iter));
	}
}
