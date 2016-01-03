package catchPlagiarist;

// -------------------------------------------------------------------------
/**
 *  List interface
 *  @param <E>
 * 
 *  @author emmawald
 *  @version Nov 28, 2015
 */
public interface ListInterface<E> extends java.lang.Iterable
{
    // ----------------------------------------------------------
    /**
     * add
     * @param e
     */
    public void add(E e);

    // ----------------------------------------------------------
    /**
     * add
     * @param index
     * @param e
     */
    public void add(int index, E e);

    // ----------------------------------------------------------
    /**
     * add
     * @param index
     * @return generic type E
     */
    public E get(int index);

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param e
     * @return int index
     */
    public int indexOf(E e);

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @return boolean is empty
     */
    public boolean isEmpty();

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param e
     * @return boolean if removed
     */
    public boolean remove(E e);

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param index
     * @return E generic
     */
    public E remove(int index);

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @return int size
     */
    public int size();
}
