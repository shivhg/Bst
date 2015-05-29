package com.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.pojo.Node;

public class BstDeleteTest {
	BstDelete bDel = null;
	Node root = null;
	Node node1 = null;
	Node node2 = null;
	Node node3 = null;
	Node node4 = null;
	Node node5 = null;
	Node node6 = null;
	Node node7 = null;
	Node node8 = null;

	@Before
	public void setup() {
		bDel = new BstDelete();
		node1 = new Node(5);
		node2 = new Node(13, node1, null);
		node3 = new Node(19);
		node4 = new Node(18, null, node3);
		node5 = new Node(23);
		node6 = new Node(20, node4, node5);
		node7 = new Node(29);
		node8 = new Node(25, node6, node7);
		root = new Node(15, node2, node8);
	}
	
	@Test 
	public void testDeleteNodeLeftRightNull() {
		assertTrue(BstImplHelper.searchHelper(root, 29));
		root = bDel.delete(root, 29);
		assertFalse(BstImplHelper.searchHelper(root, 29));
	}
	
	@Test 
	public void testDeleteNodeLeftNull() {
		assertTrue(BstImplHelper.searchHelper(root, 18));

		root = bDel.delete(root, 18);
		assertFalse(BstImplHelper.searchHelper(root, 18));
	}
	
	@Test 
	public void testDeleteNodeRightNull() {
		assertTrue(BstImplHelper.searchHelper(root, 13));
		root = bDel.delete(root, 13);
		assertFalse(BstImplHelper.searchHelper(root, 13));
	}
	
	@Test
	public void testDeleteRootWithLeftRight() {
		assertTrue(BstImplHelper.searchHelper(root, 15));
		assertEquals(15, root.getData());
		root = bDel.delete(root, 15);
		assertEquals(25, root.getData());
		assertFalse(BstImplHelper.searchHelper(root, 15));

	}

}
