package catchPlagiarist;
// -------------------------------------------------------------------------
/**
 * Exception class for duplicate item errors in search tree insertions.
 *
 * @author Emma Wald
 * @version 11/15/15
 */
public class DuplicateItemException
    extends RuntimeException
{
    // ~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Constructs this exception object.
     */
    public DuplicateItemException()
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
    public DuplicateItemException(String message)
    {
        super(message);
    }
}
