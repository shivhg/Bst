package com.helper;

import com.pojo.Node;

public class BstDelete {

	public Node delete(Node root, int deleteRec) {
		Node tempRig, tempLeft, aftDelete, newRoot;
		if (root.getData() == deleteRec) {
			Node leftSubTree, rightSubTree;
			leftSubTree = root.getLeft();
			rightSubTree = root.getRight();
			if (leftSubTree == null && rightSubTree == null)
				return null;
			else if (leftSubTree == null) {
				tempRig = rightSubTree;
				return tempRig;
			} else if (rightSubTree == null) {
				tempRig = leftSubTree;
				return tempRig;
			} else {
				tempLeft = rightSubTree;
				tempRig = rightSubTree;
				Node remaningAftDelete = rightSubTree.getLeft();
				remaningAftDelete = new Node(tempLeft.getData(), replaceLeft(
						remaningAftDelete, leftSubTree, remaningAftDelete),
						tempLeft.getRight());
				return remaningAftDelete;
			}
		}
		if (deleteRec < root.getData()) {
			aftDelete = delete(root.getLeft(), deleteRec);
			newRoot = new Node(root.getData(), aftDelete, root.getRight());
		} else {
			aftDelete = delete(root.getRight(), deleteRec);
			newRoot = new Node(root.getData(), root.getLeft(), aftDelete);
		}
		return newRoot;
	}

	private Node replaceLeft(Node left, Node root_LeftSubTree, Node left_RightSubTree) {
		if (left != null) {
			return new Node(left.getData(), replaceLeft(left.getLeft(),
					root_LeftSubTree, left_RightSubTree), left.getRight());
		}
		return root_LeftSubTree;
	}

}
