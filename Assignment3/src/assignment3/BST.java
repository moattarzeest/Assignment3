package assignment3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
public class BST {

	public BST()
    {

    }
	String storeString="";
    Node root;
    Vector<String> vect = new Vector<String>();
    public Node RecursiveFunc(Node root,String value)
    {
        if (root == null)
        {
            
            return new Node(value);
        }
        
        int x=value.compareTo(root.value);
        if (x<=0)
        {
           //If string is less
            root.left = RecursiveFunc(root.left, value);
        }
        else if (x>0)
        {
            //If string is greater
            root.right = RecursiveFunc(root.right, value);
        }
        return root;
    }
    public void traverseInOrder(Node node)
    {
    	
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print("\n" + node.value);
            //storeString=node.value;
            vect.add(node.value);
           // returnString(storeString);
            traverseInOrder(node.right);
            
        }
    }
    public boolean containsNodeRecursive (Node root, String value)
    {
        if (root == null)
        {
            return false;
        }
        if (value == root.value)
        {
            return true;
        }
        int b=value.compareTo(root.value);
        return b < 0 ? containsNodeRecursive(root.left, value)  : containsNodeRecursive(root.right, value);
    }
    public void addString(String value)
    {
        root = RecursiveFunc(root, value);
    }
    
    public String returnString(String str)
    {
    	return str;
    }
}


	  