package com.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {
	Node node = null;

	@Test
	public void TestConstNoArg() {
		node = new Node();
		assertNotNull(node);
		assertNull(node.getLeft());
		assertNull(node.getRight());
	}

	@Test
	public void TestConst1arg() {
		node = new Node(3);
		assertNotNull(node);
		assertNull(node.getLeft());
		assertNull(node.getRight());
		assertEquals(3, node.getData());
	}

	@Test
	public void TestConst3arg() {
		Node nodel = new Node(8);
		Node noder = new Node(8);
		node = new Node(3, nodel, noder);
		assertNotNull(node);
		assertNotNull(node.getLeft());
		assertNotNull(node.getRight());
		assertEquals(3, node.getData());
	}

}
