package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversals {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int index=-1;
        public static Node buildTree(int[] nodes){

            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode=new Node(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            //left->right->root
            if(root==null){
                return ;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        //Level Order exa,ple of  BFS
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            //initially we will add root and null for next line in queue
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currentNode=q.remove();
                if(currentNode==null){
                    //if currentNode is null then print next line
                    //and check if queue is empty or have elements
                    System.out.println();
                   if(!q.isEmpty()){
                       q.add(null);//if queue is  not empty then add null for next line
                   }else{
                       break;
                   }
                }else{
                    System.out.print(currentNode.data+" ");
                    if(currentNode.left!=null){
                        q.add(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        q.add(currentNode.right);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};//preorder-> root->ln->rn
        Node root= BinaryTree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println();
        System.out.println("Pre Order traversal");
        BinaryTree.preOrder(root);
        System.out.println();
        System.out.println("In order Traversal");
        BinaryTree.inOrder(root);
        System.out.println();
        System.out.println("PostOrder Traversal");
        BinaryTree.postOrder(root);
        System.out.println();
        System.out.println("Level Order Traversal");
        BinaryTree.levelOrder(root);
    }
}

