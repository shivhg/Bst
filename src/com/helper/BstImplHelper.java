package com.helper;

import com.pojo.Node;

public class BstImplHelper {
	
	 public static boolean isEmpty(Node root)
     {
         return root == null;
     }
	 
	 public static boolean searchHelper(Node root, int val)
     {
         boolean found = false;
         while ((root != null) && !found)
         {
             int rval = root.getData();
             if (val < rval)
                 root = root.getLeft();
             else if (val > rval)
                 root = root.getRight();
             else
             {
                 found = true;
                 break;
             }
             found = searchHelper(root, val);
         }
         return found;
     }
	 
	 /* Function to count number of nodes recursively */
	public static int countNodesHelper(Node r)
     {
         if (r == null)
             return 0;
         else
         {
             int l = 1;
             l += countNodesHelper(r.getLeft());
             l += countNodesHelper(r.getRight());
             return l;
         }
     }
}
