package Group_Assignment2_Problem2_BSTModification;


public class BST_Modification {
	public class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	static Node headNode = null;
	static Node prevNode = null;

	static void BSTToSkewed(Node curr, int k) {
		if (curr == null) {
			return;
		}

		if (k == 1) {
			BSTToSkewed(curr.right, k);
		} else {
			BSTToSkewed(curr.left, k);
		}

		Node leftSubTree = curr.left;
		Node rightSubTree = curr.right;

		if (headNode == null) {
			headNode = curr;
			prevNode = curr;
		} else {
			prevNode.right = curr;
			curr.left = null;
			prevNode = curr;
		}

		if (k == 1) {
			BSTToSkewed(leftSubTree, k);
		} else {
			BSTToSkewed(rightSubTree, k);
		}
	}
}
