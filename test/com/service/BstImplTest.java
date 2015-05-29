package com.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class BstImplTest {
	BstImpl bstImpl = null;

	@Test
	public void testConst() {
		bstImpl = new BstImpl();
		assertNotNull(bstImpl);
	}

	@Test
	public void testInsert() {
		bstImpl = new BstImpl();
		assertNotNull(bstImpl);
	}

	@Test
	public void testInsertNCount() {
		bstImpl = new BstImpl();
		bstImpl.insert(34);
		bstImpl.insert(22);
		bstImpl.insert(55);
		bstImpl.insert(77);
		bstImpl.insert(314);
		assertEquals(5, bstImpl.countNodes());
	}

	@Test
	public void testInsertNSearchNotFound() {
		bstImpl = new BstImpl();
		bstImpl.insert(343);
		bstImpl.insert(22);
		bstImpl.insert(55);
		bstImpl.insert(77);
		bstImpl.insert(314);
		assertFalse(bstImpl.search(33));
		assertFalse(bstImpl.search(342));
	}

	@Test
	public void testInsertNSearchFound() {
		bstImpl = new BstImpl();
		bstImpl.insert(343);
		bstImpl.insert(22);
		bstImpl.insert(55);
		bstImpl.insert(77);
		bstImpl.insert(314);
		assertTrue(bstImpl.search(22));
		assertTrue(bstImpl.search(314));
	}

}
