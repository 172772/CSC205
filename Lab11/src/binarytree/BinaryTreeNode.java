package binarytree;

/**
 * This is a Node in a Binary Tree. It provides the basic retriever/mutator and
 * toString methods
 * 
 * @author (TMR)
 * @version (11/2011)
 */
public class BinaryTreeNode<T> {
	// -------------------------------------------------------------------
	// Node structure
	protected BinaryTreeNode<T> leftSubtree;
	protected BinaryTreeNode<T> rightSubtree;
	protected T info;

	// -------------------------------------------------------------------
	/**
	 * The constructors: In this constructor just the info is given. It sets the
	 * left and right subtree pointers to null
	 */
	public BinaryTreeNode(T inf) {
		leftSubtree = null;
		info = inf;
		rightSubtree = null;
	}

	// -------------------------------------------------------------------
	/**
	 * Retriever (get) methods
	 */
	public BinaryTreeNode<T> getLeftSubtree() {
		return leftSubtree;
	}

	public BinaryTreeNode<T> getRightSubtree() {
		return rightSubtree;
	}

	public T getInfo() {
		return info;
	}

	// -------------------------------------------------------------------
	/**
	 * Mutator (set) methods
	 */
	public void setInfo(T inf) {
		info = inf;
	}

	public void setLeftSubtree(BinaryTreeNode<T> bTree) {
		leftSubtree = bTree;
	}

	public void setRightSubtree(BinaryTreeNode<T> bTree) {
		rightSubtree = bTree;
	}

	// -------------------------------------------------------------------
	public String toString() {
		return "" + info;
	}
}