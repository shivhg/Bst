package com.service;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.pojo.Node;

public class BstInsertTest {
	Node node = null;
	BstInsert bIns = null;
	@Before
	public void setup() {
		bIns = new BstInsert();
	}

	@Test
	public void testInsert() {
		node = bIns.insert(null, 4);
		assertEquals(4, node.getData());
		assertNull(node.getLeft());
		assertNull(node.getRight());
	}
	
	@Test
	public void testInsertDataLess() {
		node = bIns.insert(null, 4);
		node = bIns.insert(node, 2);
		assertEquals(4, node.getData());
		assertNotNull(node.getLeft());
		assertEquals(2,node.getLeft().getData());
		assertNull(node.getRight());
	}
	
	@Test
	public void testInsertDataGreat() {
		node = bIns.insert(null, 5);
		node = bIns.insert(node, 54);
		assertEquals(5, node.getData());
		assertNotNull(node.getRight());
		assertEquals(54, node.getRight().getData());
		assertNull(node.getLeft());
	}

}
