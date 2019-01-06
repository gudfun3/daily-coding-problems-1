package com.mwrod.daily.day8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day8Test {

	@Test
	void testCountUnivalSubTrees() {
		Day8_2 app = new Day8_2();
		Node<Integer> rightSubSubTree = new Node<Integer>(1, 
				new Node<Integer>(1), new Node<Integer>(1));
		
		Node<Integer> rightSubTree = new Node<Integer>(0, 
				rightSubSubTree, new Node<Integer>(0));
		
		Node<Integer> root = new Node<Integer>(0, 
				new Node<Integer>(1), rightSubTree);

		assertEquals(5, app.countUnivalSubTrees(root));
		
		Node<Integer> root2 = new Node<Integer>(1, null, null);
		assertEquals(1, app.countUnivalSubTrees(root2));
	}

}
