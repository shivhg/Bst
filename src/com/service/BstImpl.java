package com.service;

import static com.helper.BstImplHelper.*;
import com.helper.BstDelete;
import com.helper.BstInsert;
import com.pojo.Node;

public class BstImpl {
	private Node root;
	BstInsert bIns = new BstInsert();
	BstDelete bDel = new BstDelete();

	public BstImpl() {
		root = null;
	}

	// to insert data into bst
	public void insert(int data) {
		root = bIns.insert(root, data);
	}

	// to delete delRec from bst
	public void delete(int delRec) {
		if (isEmpty(root))
			System.out.println("Tree Empty");
		else if (search(delRec) == false)
			System.out.println("Sorry " + delRec + " is not present");
		else {
			root = bDel.delete(root, delRec);
			System.out.println(delRec + " deleted from the tree");
		}
	}

	//search value
	public boolean search(int val) {
		return searchHelper(root, val);
	}
	
	public int countNodes()
    {
        return countNodesHelper(root);
    }

}
