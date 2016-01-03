package catchPlagiarist;

import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Tests for binary search tree class.
 *
 * @author emmawald
 * @version Nov 16, 2015
 */
public class BinarySearchTreeTest extends TestCase
{

    /**
     * Create new binary search tree
     */
    BinarySearchTree<String> tree;
    /**
     * create new binary search tree
     */
    BinarySearchTree<String> tree2;


    // ----------------------------------------------------------
    /**
     * Create a new BinarySearchTreeTest object.
     */
    public BinarySearchTreeTest()
    {
        // ~~
    }


    // ----------------------------------------------------------
    /**
     * Set up
     */
    public void setUp()
    {
        tree = new BinarySearchTree<String>();
        tree2 = new BinarySearchTree<String>();
    }


    // ----------------------------------------------------------
    /**
     * test insert
     */
    public void testInsert()
    {
        tree.insert("emma");
        tree.insert("hi");
        tree.insert("computer");
        tree.insert("science");

        assertEquals(tree.isEmpty(), false);

        assertEquals(tree.find("emma"), "emma");
        assertEquals(tree.find("computer"), "computer");
        assertEquals(tree.find("science"), "science");
        assertEquals(tree.find("hi"), "hi");

//        Exception occurred = null;
//        try
//        {
//            tree.insert("emma");
//
//        }
//        catch (Exception exception)
//        {
//            occurred = exception;
//        }
//        assertNotNull(occurred);
//        assertTrue(occurred instanceof DuplicateItemException);
//        assertEquals("emma", occurred.getMessage());
    }


    // ----------------------------------------------------------
    /**
     * test remove
     */
    public void testRemove()
    {
        tree.insert("emma");
        tree.insert("hi");
        tree.insert("computer");
        tree.insert("science");

        tree.remove("emma");
        assertEquals(tree.find("emma"), null);

        tree.remove("hi");
        assertEquals(tree.find("hi"), null);

        tree.remove("computer");
        assertEquals(tree.find("computer"), null);

        //tree.remove("science");
        //assertEquals(tree.find("science"), null);

        // assertEquals(tree.isEmpty(), true);

        Exception occurred = null;
        try
        {
            tree.remove("hi");

        }
        catch (Exception exception)
        {
            occurred = exception;
        }
        assertNotNull(occurred);
        assertTrue(occurred instanceof ItemNotFoundException);
        assertEquals("hi", occurred.getMessage());
    }


    // ----------------------------------------------------------
    /**
     * test min methods
     */
    public void testMin()
    {
        assertEquals(tree.findMin(), null);

        tree.insert("emma");

        assertEquals(tree.findMin(), "emma");

        tree.insert("hi");
        tree.insert("computer");
        tree.insert("science");

        assertEquals(tree.findMin(), "computer");
    }


    // ----------------------------------------------------------
    /**
     * test max methods
     */
    public void testMax()
    {
        assertEquals(tree.findMax(), null);

        tree.insert("emma");

        assertEquals(tree.findMax(), "emma");

        tree.insert("hi");
        tree.insert("computer");
        tree.insert("science");

        assertEquals(tree.findMax(), "science");
    }


    // ----------------------------------------------------------
    /**
     * test find
     */
    public void testFind()
    {
        tree.insert("emma");
        tree.insert("hi");
        tree.insert("computer");
        tree.insert("science");

        assertEquals(tree.find("emma"), "emma");
        assertEquals(tree.find("hi"), "hi");
        assertEquals(tree.find("computer"), "computer");
        assertEquals(tree.find("science"), "science");

        assertEquals(tree.find("hello"), null);
    }


    // ----------------------------------------------------------
    /**
     * test make empty
     */
    public void testMakeEmpty()
    {
        tree.insert("emma");
        tree.insert("hi");
        tree.insert("computer");
        tree.insert("science");

        assertEquals(tree.isEmpty(), false);

        tree.makeEmpty();

        assertEquals(tree.isEmpty(), true);
    }


    // ----------------------------------------------------------
    /**
     * test is empty
     */
    public void testIsEmpty()
    {
        assertEquals(tree.isEmpty(), true);

        tree.insert("emma");
        tree.insert("hi");
        tree.insert("computer");
        tree.insert("science");

        assertEquals(tree.isEmpty(), false);
    }

    // ----------------------------------------------------------
    /**
     * traversal of one tree against another
     */
    public void testTraversal() {
        tree.insert("emma");
        tree.insert("hi");
        tree.insert("computer");
        tree.insert("science");

        tree2.insert("emma");
        tree2.insert("hello");
        tree2.insert("computers");
        tree2.insert("science");

        assertEquals(tree2.traversal(tree), 2);
    }

    // ----------------------------------------------------------
    /**
     * compare tree elements
     */
    public void testCompare() {
        tree.insert("emma");
        tree.insert("hi");
        tree.insert("computer");
        tree.insert("science");

        tree2.insert("emma");
        tree2.insert("hello");
        tree2.insert("computers");
        tree2.insert("science");

        assertEquals(tree.compare(tree2, "hi"), 0);
        assertEquals(tree.compare(tree2, "hello"), 1);
    }

}
