import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

static void levelOrder(Node root){
      Queue<Node> q = new LinkedList<>(); //Queue for traversal
      Queue<Integer> order = new LinkedList<>(); //List for printing at end
      if (root == null) { //Just in case I got an empty tree
        return;
      }
      q.add(root); //Queue first item
      
      while(!q.isEmpty()) {
        Node tree = q.remove();
        order.add(tree.data); //Send first item to list
        
        if(tree.left != null) {
            q.add(tree.left); //Grab tree on left
        }
        if(tree.right != null) {
            q.add(tree.right); //Grab tree on right
        }
      }
      
      System.out.print(order.remove());
      while(!order.isEmpty()) {
        System.out.print(" " + order.remove());
      }
      
    }

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}