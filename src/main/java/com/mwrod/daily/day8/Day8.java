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
 *  
 */
public class Day8 {

	/**
	 * Time Complexity: O(n)
	 * 
	 * @param root Root to a binary tree
	 * @return number of universal value subtrees
	 */
	public <T> int countUnivalSubTrees(Node<T> root) {
		// counter for counting the number of unival trees
		Counter counter = new Counter();
		
		// count unival trees recursively
		countUnivalTreesLocal(root, counter);
		
		return counter.count();
	}
	
	private <T> boolean countUnivalTreesLocal(Node<T> node, Counter ctr) {
		if(node == null) {
			return true;
		}
		
		// check subtrees of current node for unival condition
		boolean leftIsUnival = countUnivalTreesLocal(node.getLeft(), ctr);
		boolean rightIsUnival = countUnivalTreesLocal(node.getRight(), ctr);
		
		// check if both subtrees are unival
		if(leftIsUnival && rightIsUnival) {
			
			// if left and right child are equal to root or null
			// then the current subtree is a unival tree
			if(isUnivalChild(node, node.getLeft()) && isUnivalChild(node, node.getLeft())) {
				ctr.increment();
				return true;
			// otherwise it is not a unival tree
			} else {
				return false;
			}
		}
		
		// otherwise return false as the current tree is not a unival tree
		return false;
	}
	
	private <T> boolean isUnivalChild(Node<T> root, Node<T> child) {
		if(child != null && root.getVal().equals(child.getVal())) {
			return true;
		} else {
			return false;
		}
	}
	
	private class Counter {
		private int count = 0;
		
		private void increment() {
			this.count++;
		}
		
		private int count() {
			return count;
		}
	}
}
