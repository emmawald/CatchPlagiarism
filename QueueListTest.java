package catchPlagiarist;

import student.TestCase;

// -------------------------------------------------------------------------
/**
 *  Queue List Test
 *
 *  @author emmawald
 *  @version Nov 17, 2015
 */
public class QueueListTest extends TestCase
{

    /**
     * create QueueList object
     */
    QueueList<String> q;

    // ----------------------------------------------------------
    /**
     * Create a new QueueListTest object.
     */
    public QueueListTest() {
        //~~
    }

    // ----------------------------------------------------------
    /**
     * setUp
     */
    public void setUp() {
        q = new QueueList<String>();
    }

    // ----------------------------------------------------------
    /**
     * test enqueue
     */
    public void testEnqueue() {
        q.enqueue("e");
        q.enqueue("m");
        q.enqueue("m");
        q.enqueue("a");

        assertEquals(q.s, 4);
    }

    // ----------------------------------------------------------
    /**
     * test dequeue
     */
    public void testDequeue() {
        q.enqueue("e");
        q.enqueue("m");
        q.enqueue("m");
        q.enqueue("a");

        assertEquals(q.dequeue(), "e");
        assertEquals(q.dequeue(), "m");
        assertEquals(q.dequeue(), "m");
        assertEquals(q.dequeue(), "a");

        assertEquals(q.s, 0);
    }

    // ----------------------------------------------------------
    /**
     * test to string
     */
    public void testToString() {
        q.enqueue("e");
        q.enqueue("m");
        q.enqueue("m");
        q.enqueue("a");

        assertEquals(q.toString(), "e m m a ");
    }

}
