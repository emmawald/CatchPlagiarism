package catchPlagiarist;

// -------------------------------------------------------------------------
/**
 *  queue list
 *  @param <E>
 *
 *  @author emmawald
 *  @version Nov 17, 2015
 */
public class QueueList<E> extends ArrayList<E>
{
    /**
     * array list object
     */
    ArrayList<E> q;

    /**
     * int size
     */
    int s;

    // ----------------------------------------------------------
    /**
     * Create a new QueueList object.
     */
    public QueueList() {
        q = new ArrayList<E>();
    }

    // ----------------------------------------------------------
    /**
     * Create a new QueueList object.
     * @param list
     */
    public QueueList(E[] list) {
        q = new ArrayList<E>(list);
        s = 0;
    }

    // ----------------------------------------------------------
    /**
     * enqueue
     * @param e generic
     */
    public void enqueue(E e) {
        q.add(q.size, e);
        s++;
    }

    // ----------------------------------------------------------
    /**
     * dequeue
     * @return E generic
     */
    public E dequeue() {
        s--;
        return q.remove(0);
    }

    // ----------------------------------------------------------
    /**
     * to string
     * @return String of your queue list
     */
    public String toString() {
        String x = "";
        for(int i = 0; i < q.size; i++) {
            x += q.get(i) + " ";
        }
        return x;
    }
}
