package catchPlagiarist;

// -------------------------------------------------------------------------
/**
 *  List abstract class
 *  @param <E>
 *
 *  @author emmawald
 *  @version Nov 28, 2015
 */
public abstract class List<E> implements ListInterface<E>
{
    private int size;

    // ----------------------------------------------------------
    /**
     * Create a new List object.
     */
    public List(){
        size = 0;
    }

    // ----------------------------------------------------------
    /**
     * Create a new List object.
     * @param list
     */
    public List(E[] list) {
        for(int i = 0; i < list.length; i++) {
            this.add(list[i]);
        }
        size = list.length;
    }

    public void add(E e) {
        this.add(size, e);
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}
