package DSA;
import java.util.*;

import javax.swing.tree.TreeNode;

//import javax.swing.tree.TreeNode;

public class Trees {

  static class Node
  {
	int data;
	Node left;
	Node right;
	  Node (int d)
	{
	  data = d;
	  left = null;
	  right = null;
	}
  }
  public static Node root;
  public static void sequential ()
  {
	Queue < Node > q = new LinkedList <> ();
	q.add (root);
	while (!q.isEmpty ())
	  {
		Node temp = q.remove ();
		System.out.print (temp.data + " ");
		if (temp.left != null)
		  q.add (temp.left);
		if (temp.right != null)
		  q.add (temp.right);
	  }
  }
  public static void  levelOrderTraversal()
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
       while(!q.isEmpty())
       { 
        Node temp=q.remove();
        if(temp==null)
        {
            if(q.isEmpty()) break;
            System.out.println();
            q.add(null);
        
        }
        else
        { System.out.print(temp.data+" ");
        if(temp.left!=null) q.add(temp.left);
        if(temp.right!=null) q.add(temp.right);
        }
       }
    }
  public static void inOrderTraversal (Node root)
  {
	if (root == null)
	  return;
	inOrderTraversal (root.left);
	System.out.print (root.data + " ");
	inOrderTraversal (root.right);
  }
  public static void preOrderTraversal (Node root)
  {
	if (root == null)
	  return;
    System.out.print (root.data + " ");
	preOrderTraversal (root.left);
	preOrderTraversal (root.right);
  }
  public static void postOrderTraversal (Node root)
  {
	if (root == null)
	  return;
	postOrderTraversal (root.left);
	postOrderTraversal (root.right);
	System.out.print (root.data + " ");
  }
  public static int sumBT (Node head)
  {
	if (head == null)
	  return 0;
	return sumBT (head.left) + sumBT (head.right) + head.data;

  }
  public static int countNodes (Node root)
  {
	if (root == null)
	  return 0;
	return countNodes (root.left) + countNodes (root.right) + 1;

  }
  public static int maxDepth (Node root)
  {
	if (root == null)
	  return 0;
	int leftDepth = maxDepth (root.left);
	int rightDepth = maxDepth (root.right);
	return Math.max (leftDepth, rightDepth) + 1;
  }
  public static void inOrderTraversal1(Node root)
  {
      Stack<Node> st=new Stack<>();
      Node curr=root;
      while(curr!=null || st.size()>0)
      {
          while(curr!=null)
          {
              st.add(curr);
              curr=curr.left;
          }
          curr=st.pop();
          System.out.print(curr.data+" ");
          curr=curr.right;
      }
  }
  
  public static void preOrderTraversal1(Node root)
    {
        Stack<Node> s=new Stack<>();
        if(root==null) return ;
        s.push(root);
        while(!s.isEmpty())
        {
            Node temp=s.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null) s.push(temp.right);
            if(temp.left!=null) s.push(temp.left);
        }
    }
    
    public static void  elementsatKthlevel(int k)
    {
        int sum=0;
        Queue<Node> q=new LinkedList<>();
        int count=0;
        q.add(root);
        q.add(null);
       while(!q.isEmpty())
       { 
        Node temp=q.remove();
        if(temp==null)
        {
            if(q.isEmpty()) break;
            System.out.println();
            q.add(null);
            count++;
        
        }
        else
        {if(count==k){
            System.out.print(temp.data+" ");
            sum=sum+temp.data;
        }
        if(temp.left!=null) q.add(temp.left);
        if(temp.right!=null) q.add(temp.right);
        }
        
       }
       System.out.println("sum="+sum);
    }
    public static Node lowestCommonAncestor(Node root,Node p,Node q)
    {
        if(root==null || root==p || root==q)
        return root;
        Node left=lowestCommonAncestor(root.left,p,q);
        Node right=lowestCommonAncestor(root.right,p,q);
        if(left==null)
        return right;
        if(right==null)
        return left;
        return root;

    }
    public static int transformToSumTree(Node root)
    {
        if(root==null)return 0;
        int leftsum=transformToSumTree(root.left);
        int rightsum=transformToSumTree(root.right);
        int data=root.data;
        int left=root.left==null?0:root.left.data;
        int right=root.right==null?0:root.right.data;
        root.data=leftsum+rightsum+left+right;
        return data;
    }
    public static Node function(int[] preorder, int[] inorder, int prSt, int preEn, int inSt, int inEn, HashMap<Integer, Integer> map){
        if(inSt>inEn || prSt>preEn) return null;
        Node newNode = new Node(preorder[prSt]);
        int index = map.get(preorder[prSt]);
        int noOfEle = index-inSt;
        newNode.left = function(preorder, inorder, prSt+1, prSt+noOfEle, inSt, index-1, map);
        newNode.right = function(preorder, inorder, prSt+noOfEle+1, preEn, index+1, inEn, map);
        return newNode;
    }
    public static Node buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }
        return function(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1, map);
    }
   
  public static void main (String[]args)
  {
	root = new Node (1);
	root.left = new Node (2);
	root.right = new Node (3);
	root.left.left = new Node (4);
	root.left.right = new Node (5);
	root.right.left = new Node (6);
	root.right.right = new Node (7);
	//sequential();
	//levelOrderTraversal();
	inOrderTraversal(root);
	//preOrderTraversal(root);
	//postOrderTraversal(root);
	//int ans=sumBT(root);
	//System.out.println(ans);
	//int ans=countNodes(root);
	//System.out.println(ans);
	//inOrderTraversal1(root);
	//int ans=maxDepth(root);
	//System.out.print(ans);
	//preOrderTraversal1(root);
	//elementsatKthlevel(1);
    //Node ans=lowestCommonAncestor(root, root.right, root.left);
    //System.out.print(ans);
    ////int[] inorder={4,2,5,1,6,3,7};
   // int[] preorder={1,2,4,5,3,6,7};
   // buildTree(preorder,inorder);
   System.out.println(transformToSumTree(root));

}
}
