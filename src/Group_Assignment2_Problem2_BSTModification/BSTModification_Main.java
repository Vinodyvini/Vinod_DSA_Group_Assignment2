package Group_Assignment2_Problem2_BSTModification;

public class BSTModification_Main {
	public static void main(String[] args) {
        BST_Modification skewed = new BST_Modification();

        BST_Modification.Node root = skewed.new Node(50);
        root.left = skewed.new Node(30);
        root.left.left = skewed.new Node(10);
        root.left.right = skewed.new Node(40);
        root.right = skewed.new Node(60);
        root.right.left = skewed.new Node(55);

        int k = 0; // For increasing order

        BST_Modification.BSTToSkewed(root, k);

        // Traversing the skewed tree
        while (BST_Modification.headNode != null) {
            System.out.print(BST_Modification.headNode.data + " ");
            BST_Modification.headNode = BST_Modification.headNode.right;
        }
        System.out.println();
    }
}
