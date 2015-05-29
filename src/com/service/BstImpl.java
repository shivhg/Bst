package com.service;

import com.pojo.Node;

public class BstImpl {
	private Node root;
	BstInsert bIns = new BstInsert();

	public BstImpl() {
		root = null;
	}

	public void insert(int data) {
		root = bIns.insert(root, data);
	}

}
