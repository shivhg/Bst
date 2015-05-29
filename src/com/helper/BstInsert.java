package com.helper;

import com.pojo.Node;

public class BstInsert {
	private Node lroot;
	private Node rroot;

	public Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		} else {
			if (data <= node.getData()) {
				lroot = insert(node.getLeft(), data);
				node = new Node(node.getData(), lroot, node.getRight());
			} else {				

				rroot = insert(node.getRight(), data);
				node = new Node(node.getData(), node.getLeft(), rroot);
			}
		}

		return node;
	}
}
