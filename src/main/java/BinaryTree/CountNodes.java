package BinaryTree;

public class CountNodes {
    public static int countNodes(TreeTraversals.Node root){
        if(root==null){
            return 0;
        }
        int countLeftNodes=countNodes(root.left);
        int countRightNodes=countNodes(root.right);
        return countLeftNodes+countRightNodes+1;
    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};//preorder-> root->ln->rn
        TreeTraversals.Node root= TreeTraversals.BinaryTree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println();
        System.out.println(countNodes(root));
    }
}
