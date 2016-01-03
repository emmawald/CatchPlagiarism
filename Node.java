package catchPlagiarist;

// -------------------------------------------------------------------------
/**
 *  Node
 *  @param <E>
 *
 *  @author emmawald
 *  @version Nov 28, 2015
 */
public class Node<E>
{
    /**
     * data
     */
    E data;
    /**
     * next
     */
    Node<E> next;

    // ----------------------------------------------------------
    /**
     * Create a new Node object.
     * @param e
     */
    public Node(E e) {
        data = e;
        next = null;
    }
}
