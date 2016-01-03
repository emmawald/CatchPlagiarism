package catchPlagiarist;
// -------------------------------------------------------------------------
/**
 * Exception class for failed finds/removes in search trees, hash tables, and
 * list and tree iterators.
 *
 * @author Emma Wald
 * @version 11/15/15
 */
public class ItemNotFoundException
    extends RuntimeException
{
    // ~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Constructs this exception object.
     */
    public ItemNotFoundException()
    {
        super();
    }


    // ----------------------------------------------------------
    /**
     * Constructs this exception object.
     *
     * @param message
     *            the error message.
     */
    public ItemNotFoundException(String message)
    {
        super(message);
    }
}
