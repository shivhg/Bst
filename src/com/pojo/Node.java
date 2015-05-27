/** 
 * 
 * @author shiva_hg
 * Immutable AvlNode class
 *
 */
package com.pojo;

public class Node {
	private final Node left;
	private final Node right;
	private final int data;
	
	public Node()
    {
        left = null;
        right = null;
        data = 0;
    }
    /* Constructor */
    public Node(int n)
    {
        left = null;
        right = null;
        data = n;
    }
    
    public Node(int n,Node l,Node r)
    {
        left = l;
        right = r;
        data = n;
    }
    
	public Node getLeft() {
		return left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public int getData() {
		return data;
	}
	
}
