package catchPlagiarist;

// -------------------------------------------------------------------------
/**
 * Implements an unbalanced binary search tree. Note that all "matching" is
 * based on the compareTo() method.
 *
 * @param <T>
 *            The type of data element contained in the node.
 * @author Emma Wald
 * @version 11/15/15
 */
public class BinarySearchTree<T extends Comparable<? super T>>
{
    // ~ Instance/static variables .............................................

    private BinaryNode<T> root;
    private int           size;

    // ~ Constructor ...........................................................


    // ----------------------------------------------------------
    /**
     * Constructs an empty tree.
     */
    public BinarySearchTree()
    {
        root = null;
        size = 0;
    }

    // ~ Public methods ........................................................


    // ----------------------------------------------------------
    /**
     * Insert into the tree.
     *
     * @param x
     *            the item to insert.
     * @throws DuplicateItemException
     *             if x is already present.
     */
    public void insert(T x)
    {
        root = insert(x, root);
    }


    // ----------------------------------------------------------
    /**
     * Remove the specified value from the tree.
     *
     * @param x
     *            the item to remove.
     * @throws ItemNotFoundException
     *             if x is not found.
     */
    public void remove(T x)
    {
        remove(x, root);
    }


    // ----------------------------------------------------------
    /**
     * Find the smallest item in the tree.
     *
     * @return The smallest item, or null if the tree is empty.
     */
    public T findMin()
    {
        return elementAt(findMin(root));
    }


    // ----------------------------------------------------------
    /**
     * Find the largest item in the tree.
     *
     * @return The largest item in the tree, or null if the tree is empty.
     */
    public T findMax()
    {
        return elementAt(findMax(root));
    }


    // ----------------------------------------------------------
    /**
     * Find an item in the tree.
     *
     * @param x
     *            the item to search for.
     * @return the matching item or null if not found.
     */
    public T find(T x)
    {
        return elementAt(find(x, root));
    }


    // ----------------------------------------------------------
    /**
     * Make the tree logically empty.
     */
    public void makeEmpty()
    {
        root = null;
        size = 0;
    }


    // ----------------------------------------------------------
    /**
     * Test if the tree is logically empty.
     *
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty()
    {
        return root == null;
    }


    // ----------------------------------------------------------
    /**
     * Internal method to get element value stored in a tree node, with safe
     * handling of null nodes.
     *
     * @param node
     *            the node.
     * @return the element field or null if node is null.
     */
    private T elementAt(BinaryNode<T> node)
    {
        return (node == null) ? null : node.getElement();
    }


    // ----------------------------------------------------------
    /**
     * Internal method to insert a value into a subtree.
     *
     * @param x
     *            the item to insert.
     * @param node
     *            the node that roots the subtree.
     * @return the new root of the subtree.
     * @throws DuplicateItemException
     *             if x is already present.
     */
    private BinaryNode<T> insert(T x, BinaryNode<T> node)
    {
        if (node == null)
        {
            return new BinaryNode<T>(x);
        }
        else if (x.compareTo(node.getElement()) < 0)
        {
            node.setLeft(insert(x, node.getLeft()));
        }
        else if (x.compareTo(node.getElement()) > 0)
        {
            node.setRight(insert(x, node.getRight()));
        }
        size++;
        // else
        // {
        // throw new DuplicateItemException(x.toString());
        // }
        return node;
    }


    // ----------------------------------------------------------
    /**
     * Internal method to remove a specified item from a subtree.
     *
     * @param x
     *            the item to remove.
     * @param node
     *            the node that roots the subtree.
     * @return the new root of the subtree.
     * @throws ItemNotFoundException
     *             if x is not found.
     */
    private BinaryNode<T> remove(T x, BinaryNode<T> node)
    {
        // This local variable will contain the new root of the subtree,
        // if the root needs to change.
        BinaryNode<T> result = node;

        // If there's no more subtree to examine
        if (node == null)
        {
            throw new ItemNotFoundException(x.toString());
        }

        // if value should be to the left of the root
        if (x.compareTo(node.getElement()) < 0)
        {
            node.setLeft(remove(x, node.getLeft()));
        }
        // if value should be to the right of the root
        else if (x.compareTo(node.getElement()) > 0)
        {
            node.setRight(remove(x, node.getRight()));
        }
        // If value is on the current node
        else
        {
            // If there are two children
            if (node.getLeft() != null && node.getRight() != null)
            {
                BinaryNode<T> temp = findMin(node.getRight());
                node.setElement(temp.getElement());
                temp = remove(node.getElement(), node.getRight());
                node.setRight(temp);
            }
            // If there is only one child on the left
            else if (node.getLeft() != null)
            {
                result = node.getLeft();
            }
            // If there is only one child on the right
            else
            {
                result = node.getRight();
            }
        }
        size--;
        return result;
    }


    // ----------------------------------------------------------
    /**
     * Internal method to find the smallest item in a subtree.
     *
     * @param node
     *            the node that roots the tree.
     * @return node containing the smallest item.
     */
    private BinaryNode<T> findMin(BinaryNode<T> node)
    {
        if (node == null)
        {
            return node;
        }
        else if (node.getLeft() == null)
        {
            return node;
        }
        else
        {
            return findMin(node.getLeft());
        }
    }


    // ----------------------------------------------------------
    /**
     * Internal method to find the largest item in a subtree.
     *
     * @param node
     *            the node that roots the tree.
     * @return node containing the largest item.
     */
    private BinaryNode<T> findMax(BinaryNode<T> node)
    {
        if (node == null)
        {
            return node;
        }
        else if (node.getRight() == null)
        {
            return node;
        }
        else
        {
            return findMax(node.getRight());
        }
    }


    // ----------------------------------------------------------
    /**
     * Internal method to find an item in a subtree.
     *
     * @param x
     *            is item to search for.
     * @param node
     *            the node that roots the tree.
     * @return node containing the matched item.
     */
    private BinaryNode<T> find(T x, BinaryNode<T> node)
    {
        if (node == null)
        {
            return null; // Not found
        }
        else if (x.compareTo(node.getElement()) < 0)
        {
            // Search in the left subtree
            return find(x, node.getLeft());
        }
        else if (x.compareTo(node.getElement()) > 0)
        {
            // Search in the right subtree
            return find(x, node.getRight());
        }
        else
        {
            return node; // Match
        }
    }


    // ----------------------------------------------------------
    /**
     * traversal method
     * @param other ~~
     * @param node ~~
     * @return integer for number of the same n length sequences
     */
    public int traversal(
        BinarySearchTree<T> other,
        BinaryNode<T> node)
    {

        if (node == null)
        {
            return 0;
        }

        return compare(other, node.getElement())
            + traversal(other, node.getLeft())
            + traversal(other, node.getRight());
    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param other ~~
     * @return integer for values of similarity
     */
    public int traversal(BinarySearchTree<T> other)
    {
        return traversal(other, this.root);
    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param other ~~
     * @param element ~~
     * @return number for if in or not
     */
    public int compare(BinarySearchTree<T> other, T element)
    {
        if (other.find(element) != null)
        {
            return 1;
        }
        return 0;
    }


    // ----------------------------------------------------------
    /**
     * get size
     *
     * @return int size
     */
    public int getSize()
    {
        return size;
    }

}
