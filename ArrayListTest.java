package catchPlagiarist;

import student.TestCase;

// -------------------------------------------------------------------------
/**
 *  Test Array List
 *
 *  @author emmawald
 *  @version Nov 17, 2015
 */
public class ArrayListTest extends TestCase
{

    /**
     * new array list object
     */
    ArrayList<Integer> a;

    // ----------------------------------------------------------
    /**
     * Create a new ArrayListTest object.
     */
    public ArrayListTest() {
        //~~
    }

    /**
     * set up
     */
    public void setUp() {
        a = new ArrayList<Integer>();
    }

    // ----------------------------------------------------------
    /**
     * test add
     */
    public void testAdd() {
        a.add(1);
        assertEquals(a.size(), 1);
        a.add(2);
        assertEquals(a.size(), 2);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        assertEquals(a.size, 13);
    }

    // ----------------------------------------------------------
    /**
     * test remove
     */
    public void testRemove() {
        ArrayList<String> s = new ArrayList<String>();
        s.add("e");
        s.add("m");
        s.add("m");
        s.add("a");

        assertEquals(s.remove(0), "e");
        assertEquals(s.remove("m"), true);
        assertEquals(s.remove("x"), false);

        Exception occurred = null;
        try
        {
            s.remove(-1);

        }
        catch (Exception exception)
        {
            occurred = exception;
        }
        assertNotNull(occurred);
        assertTrue(occurred instanceof IndexOutOfBoundsException);
        assertEquals("Index out of bounds", occurred.getMessage());
    }

    // ----------------------------------------------------------
    /**
     * test trim to size
     */
    public void testTrimToSize() {
        a.add(1);
        a.add(2);
        a.trimToSize();
    }

    // ----------------------------------------------------------
    /**
     * test getter
     */
    public void testGet() {
        ArrayList<String> s = new ArrayList<String>();
        s.add("e");
        s.add("m");
        assertEquals(s.get(1), "m");
        assertEquals(s.get(0), "e");
    }

}
