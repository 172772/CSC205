package binarytree;

public class BinaryTreeTester {
	public static void main(String[] args)
    {
        //Testing height, numNodes, isFull and isStrictlyBinaryTree, isBalanced
        BinaryTree<String> treeA = new BinaryTree<String>("A");
        BinaryTree<String> treeB = new BinaryTree<String>("B");
        BinaryTree<String> treeC = new BinaryTree<String>(treeA, "C", treeB);
        
        BinaryTree<String> treeD = new BinaryTree<String>("D");
        BinaryTree<String> treeE = new BinaryTree<String>("E");
        BinaryTree<String> treeF = new BinaryTree<String>(treeD, "F", treeE);
        BinaryTree<String> treeG = new BinaryTree<String>(treeC, "G", treeF);
        

        System.out.println("Height of the treeG " + 
        		"Expected Value = 3; Computed Value = " + treeG.height());
        System.out.println("Number of nodes in treeG " + 
        		"Expected Value = 7; Computed Value = " + treeG.numNodes());
        System.out.println("Is treeG a full binary tree? " + 
        		"Expected Value = true; Computed Value = " + treeG.isFull());
        System.out.println("Is treeG a strictly binary tree? " + 
        		"Expected Value = true;  Computed Value = " + treeG.isStrictlyBinary());
        System.out.println("Is treeG a balanced binary tree? " + 
        		"Expected Value = true;  Computed Value = " + treeG.isBalanced());
       
        
        System.out.println("\n------------------------------------------\n");
        
        
        BinaryTree<String> treeH = new BinaryTree<String>("H");
        BinaryTree<String> treeI = new BinaryTree<String>(treeH, "I", treeG);
        
        System.out.println("Height of the treeI " + 
        		"Expected Value = 4; Computed Value = " + treeI.height());
        System.out.println("Number of nodes in treeI " + 
        		"Expected Value = 9; Computed Value = " + treeI.numNodes());
        System.out.println("Is treeI a full binary tree? " + 
        		"Expected Value = false;  Computed Value = " + treeI.isFull());
        System.out.println("Is treeI a strictly binary tree? " + 
        		"Expected Value = true;  Computed Value = " + treeI.isStrictlyBinary());
        System.out.println("Is treeI a balanced binary tree? " + 
        		"Expected Value = false; Computed Value = " + treeI.isBalanced());
 
    }
}
