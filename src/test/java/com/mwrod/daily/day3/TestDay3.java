package com.mwrod.daily.day3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.mwrod.daily.day3.Day3;
import com.mwrod.daily.day3.Node;

public class TestDay3 {

	@Test
	public void testSerializiationBinaryTree() {
		Day3 app = new Day3();
		
		Node tree = new Node("root", 
				new Node("left", 
						new Node("left.left", null, null),
						null), 
				new Node("right", null, null));
		
		Node resultTree = app.deserializeBinaryTree(app.serializeBinaryTree(tree));
		assertNotNull(resultTree);
		assertNotNull(resultTree.getLeft());
		assertNotNull(resultTree.getLeft().getLeft());
	
		assertEquals("left.left", resultTree.getLeft().getLeft().getVal());
	}
}
