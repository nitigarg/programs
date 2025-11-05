package BinaryTree;

public class SumOfNodes {
    public static int sumOfNodes(TreeTraversals.Node root){
        if(root==null){
            return 0;
        }
        int sumOfLeftNodes=sumOfNodes(root.left);
        int sumOfRightNodes=sumOfNodes(root.right);
        return sumOfLeftNodes+sumOfRightNodes+root.data;
    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};//preorder-> root->ln->rn
        TreeTraversals.Node root= TreeTraversals.BinaryTree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println();
        System.out.println(sumOfNodes(root));
    }
}
