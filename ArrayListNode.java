package catchPlagiarist;
// -------------------------------------------------------------------------
/**
 * A basic node stored in an unbalanced binary search tree. This class is not
 * accessible outside of this package.
 *
 *            The type of data element contained in the node.
 * @author Emma Wald
 * @version 11/15/15
 */
class ArrayListNode
{
    // ~ Instance/static variables .............................................

    private String fileName;
    private BinarySearchTree<String> tree;

    // ~ Constructor ...........................................................


    // ----------------------------------------------------------
    /**
     * Creates a node with two data elements
     *
     * @param tree Binary Search Tree type String
     * @param fileName String
     */
    ArrayListNode(BinarySearchTree<String> tree, String fileName)
    {
        this.tree = tree;
        this.fileName = fileName;
    }

    // ----------------------------------------------------------
    /**
     * no arg constructor
     * Create a new ArrayListNode object.
     */
    ArrayListNode() {
        this.tree = null;
        this.fileName = null;
    }

    // ~ Public methods ........................................................


    // ----------------------------------------------------------
    /**
     * get file name
     *
     * @return String element
     */
    public String getFileName()
    {
        return fileName;
    }

    // ----------------------------------------------------------
    /**
     * get tree
     * @return BinarySearchTree<String> tree
     */
    public BinarySearchTree<String> getTree() {
        return tree;
    }

    // ----------------------------------------------------------
    /**
     * set tree element
     *
     * @param tree Binary Search Tree type String
     */
    public void setTree(BinarySearchTree<String> tree)
    {
        this.tree = tree;
    }


    // ----------------------------------------------------------
    /**
     * set file name
     *
     * @param fileName String
     */
    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

}
