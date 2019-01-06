package com.mwrod.daily.day8;

/**
 * Problem: A unival tree (which stands for "universal value") is a 
 * 	tree where all nodes under it have the same value. Given the 
 * 	root to a binary tree, count the number of unival subtrees.
 * 
 * Example: The following tree has 5 unival subtrees
 * 
 *    0
 *   / \
 *  1   0
 *     / \
 *    1   0
 *   / \
 *  1   1
 */
public class Day8_2 {

	/**
	 * Time Complexity: O(n^2)
	 * 
	 * @param root Root to a binary tree
	 * @return number of universal value subtrees
	 */
	public <T> int countUnivalSubTrees(Node<T> root) {
		if(root == null) {
			// if current node is null the count of
			// unival trees is 0
			return 0;
		}
		
		// count the unival trees in the left subtree
		// and right subtree recursively
		int left = countUnivalSubTrees(root.getLeft());
		int right = countUnivalSubTrees(root.getRight());
		
		// check if the current subtree is a unival tree
		if(isUnivalTree(root)) {
			return left + right + 1;
		} else {
			return left + right;
		}
	}
	
	/*
	 * Checks recursive if the tree of the given node
	 * is a unival tree.
	 */
	private <T> boolean isUnivalTree(Node<T> node) {
		if(node == null) {
			// return true if the node is a leave
			return true;
		} else {
			// check the criteria for a universal tree
			// for the current node and children and
			// recursive for the subtrees of the children
			return isUnivalLocal(node) && 
					isUnivalTree(node.getLeft()) && 
					isUnivalTree(node.getRight());
		}
	}
	
	/*
	 * Checks the criteria of a universal tree for the
	 * local nodes (root, left, right).
	 */
	private <T> boolean isUnivalLocal(Node<T> root) {
		boolean univalLocal = true;
		
		// checks root and left child for equality
		if(root.getLeft() != null) {
			univalLocal = univalLocal && root.getVal().equals(root.getLeft().getVal());
		}
		
		// checks root and right child for equality
		if(root.getRight() != null) {
			univalLocal = univalLocal && root.getVal().equals(root.getRight().getVal());
		}
		
		return univalLocal;
	}
}
