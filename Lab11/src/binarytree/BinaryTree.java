package binarytree;

/**
 * class BinaryTree: A binary-tree implementation. The binary tree is
 * represented by a pointer (reference) to the root node of the tree. If the
 * tree is empty, this pointer will be null.
 * 
 * @author (T.M. Rao)
 * @version (Nov 2011)
 */
public class BinaryTree<T> {
	// -------------------------------------------------------------------
	BinaryTreeNode<T> root; // Pointer to the root node

	// -------------------------------------------------------------------
	/**
	 * The constructors: This is the empty constructor. Creates an empty binary
	 * tree
	 */
	public BinaryTree() {
		root = null;
	}

	// -------------------------------------------------------------------
	/**
	 * The constructors: This receives a root as an argument and sets the root
	 * pointer to the new root.
	 */
	public BinaryTree(BinaryTreeNode<T> root) {
		this.root = root;
	}

	// -------------------------------------------------------------------
	/**
	 * The constructors: This receives an info object. Creates a new tree with
	 * one node containing the info.
	 */
	public BinaryTree(T info) {
		root = new BinaryTreeNode<T>(info);
	}

	// -------------------------------------------------------------------
	/**
	 * The constructors: This receives the info and two binary tree nodes: left
	 * and right as arguments. Creates a new node with info in it and sets its
	 * left and right pointers. This is the 'build' operation that builds larger
	 * binary trees from two smaller ones.
	 */
	public BinaryTree(BinaryTreeNode<T> left, T inf, BinaryTreeNode<T> right) {
		root = new BinaryTreeNode<T>(inf);
		root.setLeftSubtree(left);
		root.setRightSubtree(right);

	}

	// -------------------------------------------------------------------
	/**
	 * The constructors: This is another version of the same operation as above.
	 * This receives the info and two binary trees: left and right as arguments.
	 * Creates a new node with info in it and sets its left and right pointers.
	 * This is the 'build' operation that builds larger binary trees from two
	 * smaller ones.
	 */
	public BinaryTree(BinaryTree<T> left, T inf, BinaryTree<T> right) {
		root = new BinaryTreeNode<T>(inf);
		root.setLeftSubtree(left.getRoot());
		root.setRightSubtree(right.getRoot());
	}

	// -------------------------------------------------------------------
	/**
	 * Binary Tree operations
	 * 
	 * Test for empty tree
	 */
	public boolean isEmpty() {
		return (root == null);
	}

	// -------------------------------------------------------------------
	/**
	 * Retriever methods
	 */
	public T getInfo() {
		if (isEmpty()) {
			System.out.println("Error in BinaryTree.getInfo(), tree is empty");
			return null;
		}
		return root.getInfo();
	}

	// ------------------------------------------------------------------
	public BinaryTreeNode<T> getRoot() {
		return root;
	}

	// ------------------------------------------------------------------
	public BinaryTree<T> getLeftSubtree() {
		if (isEmpty()) {
			System.out.println("Error in BinaryTree.getLeft(), tree is empty");
			return null;
		}
		return new BinaryTree<T>(root.getLeftSubtree());
	}

	// ------------------------------------------------------------------
	public BinaryTree<T> getRightSubtree() {
		if (isEmpty()) {
			System.out.println("Error in BinaryTree.getRight(), tree is empty");
			return null;
		}
		return new BinaryTree<T>(root.getRightSubtree());

	}

	// ------------------------------------------------------------------
	/**
	 * Mutator methods
	 */
	public void setRoot(BinaryTreeNode<T> node) {
		root = node;
	}

	// ------------------------------------------------------------------
	public void setLeftSubtree(BinaryTree<T> tree) {
		root.setLeftSubtree(tree.getRoot());
	}

	// ------------------------------------------------------------------
	public void setRightSubtree(BinaryTree<T> tree) {
		root.setRightSubtree(tree.getRoot());
	}

	/**
	 * Binary Tree traversals: There are two versions of each. One with no
	 * arguments, and another with a BinaryTree argument.
	 */
	// ------------------------------------------------------------------
	public String preOrderTraverse() {
		return preOrderTraverse(this);
	}

	// ------------------------------------------------------------------
	public String preOrderTraverse(BinaryTree<T> tree) {
		String traversal = "";
		if (!tree.isEmpty()) {
			traversal = traversal + "  " + tree.toString();
			traversal = traversal + preOrderTraverse(tree.getLeftSubtree());
			traversal = traversal + preOrderTraverse(tree.getRightSubtree());
		}
		return traversal;
	}

	// ------------------------------------------------------------------
	public String postOrderTraverse() {
		return postOrderTraverse(this);
	}

	// ------------------------------------------------------------------
	public String postOrderTraverse(BinaryTree<T> tree) {
		String traversal = "";
		if (!tree.isEmpty()) {
			traversal = traversal + postOrderTraverse(tree.getLeftSubtree());
			traversal = traversal + postOrderTraverse(tree.getRightSubtree());
			traversal = traversal + "  " + tree.toString();
		}
		return traversal;
	}

	// ------------------------------------------------------------------
	public String inOrderTraverse() {
		return inOrderTraverse(this);
	}

	// ------------------------------------------------------------------
	public String inOrderTraverse(BinaryTree<T> tree) {
		String traversal = "";
		if (!tree.isEmpty()) {
			traversal = traversal + tree.inOrderTraverse(tree.getLeftSubtree());
			traversal = traversal + "  " + tree.toString();
			traversal = traversal
					+ tree.inOrderTraverse(tree.getRightSubtree());
		}
		return traversal;
	}

	// ------------------------------------------------------------------
	/**
	 * Tree Properties: height, numNodes, isStrictlyBinary, isFull, etc.
	 */
	public int height() {
		return height(this);
	}

	// ------------------------------------------------------------------
	public int height(BinaryTree<T> tree) {
		if (tree.isEmpty())
			return 0;
		return (1 + Math.max(height(tree.getLeftSubtree()),
				height(tree.getRightSubtree())));
	}

	// ------------------------------------------------------------------
	public int numNodes() {
		return numNodes(this);
	}

	// ------------------------------------------------------------------
	public int numNodes(BinaryTree<T> tree) {
		if (tree.isEmpty())
			return 0;
		return 1 + numNodes(tree.getLeftSubtree())
				+ numNodes(tree.getRightSubtree());
	}

	// ------------------------------------------------------------------
	public boolean isStrictlyBinary() {
		return isStrictlyBinary(this);
	}

	// ------------------------------------------------------------------
	public boolean isStrictlyBinary(BinaryTree<T> tree) {
		if (tree.isEmpty())
			return true;
		if (!tree.getLeftSubtree().isEmpty()
				&& tree.getRightSubtree().isEmpty())
			return false;
		if (!tree.getRightSubtree().isEmpty()
				&& tree.getLeftSubtree().isEmpty())
			return false;
		return isStrictlyBinary(tree.getLeftSubtree())
				&& isStrictlyBinary(tree.getRightSubtree());
	}

	// ------------------------------------------------------------------
	public boolean isFull() {
		if (numNodes() == Math.pow(2, height()) - 1)
			return true;
		return false;
	}

	// ------------------------------------------------------------------
	public boolean isBalanced() {
		return isBalanced(this);
	}

	// ------------------------------------------------------------------
	public boolean isBalanced(BinaryTree<T> tree) {
		if (tree.isEmpty())
			return true;
		if ( Math.abs( tree.getLeftSubtree().height() - tree.getRightSubtree().height() ) <= 1)
			return true;
		return false;
	}

	// ------------------------------------------------------------------
	public int eval(BinaryTree<T> bt) {
		if (bt.getLeftSubtree().isEmpty() && bt.getRightSubtree().isEmpty())
			return Integer.parseInt((String) bt.getRoot().getInfo());
		int leftVal = eval(bt.getLeftSubtree());
		int rightVal = eval(bt.getRightSubtree());
		return performOperation(leftVal, (String) bt.getRoot().getInfo(),
				rightVal);
	}

	// ------------------------------------------------------------------
	private int performOperation(int lVal, String opr, int rVal) {
		if (opr.equals("+"))
			return lVal + rVal;
		if (opr.equals("-"))
			return lVal - rVal;
		if (opr.equals("*"))
			return lVal * rVal;
		if (opr.equals("/"))
			return lVal / rVal;
		if (opr.equals("%"))
			return lVal % rVal;
		return -100000;
	}

	// ------------------------------------------------------------------
	public String toString() {
		if (!isEmpty())
			return (root.getInfo()).toString();
		return null;
	}

}
