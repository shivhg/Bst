package com.helper;

import static org.junit.Assert.*;
import static com.helper.BstImplHelper.*;

import org.junit.Test;

import com.pojo.Node;

public class BstImplHelperTest {
	Node root = null;
	Node node1 = null;
	Node node2 = null;
	Node node3 = null;

	@Test
	public void testIsEmpty() {
		assertTrue(isEmpty(root));
	}

	@Test
	public void testIsEmptyFalse() {
		root = new Node(33);
		assertFalse(BstImplHelper.isEmpty(root));
	}

	@Test
	public void testSearchHelperNull() {
		assertFalse(searchHelper(null, 25));
	}

	@Test
	public void testSearchHelperNotFound() {
		node1 = new Node(35);
		node2 = new Node(20);
		node3 = new Node(25, node2, node1);
		root = new Node(23, node2, node3);
		assertFalse(searchHelper(node3, 23));
		assertFalse(searchHelper(node2, 35));
		assertFalse(searchHelper(node1, 25));
	}

	@Test
	public void testSearchHelperFound() {
		node1 = new Node(35);
		node2 = new Node(20);
		node3 = new Node(25, node2, node1);
		root = new Node(23, node2, node3);
		assertTrue(searchHelper(root, 35));
		assertTrue(searchHelper(root, 20));
		assertTrue(searchHelper(root, 25));
		assertTrue(searchHelper(root, 23));
		assertTrue(searchHelper(node3, 35));
		assertTrue(searchHelper(node3, 20));
	}

	@Test
	public void testCountNodesHelper() {
		node1 = new Node(35);
		node2 = new Node(20);
		node3 = new Node(25, node2, node1);
		root = new Node(23, node2, node3);
		assertEquals(3, countNodesHelper(node3));
		assertEquals(1, countNodesHelper(node2));
		assertEquals(1, countNodesHelper(node1));
		assertEquals(5, countNodesHelper(root));

	}

}
