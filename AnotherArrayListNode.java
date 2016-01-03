package catchPlagiarist;

// -------------------------------------------------------------------------
/**
 *  array list node for comparison
 *
 *  @author emmawald
 *  @version Dec 4, 2015
 */
public class AnotherArrayListNode
{
    /**
     * name 1
     */
    String name1;
    /**
     * name 2
     */
    String name2;
    /**
     * count
     */
    int count;

    // ----------------------------------------------------------
    /**
     * Create a new AnotherArrayListNode object.
     * @param name1
     * @param name2
     * @param count
     */
    public AnotherArrayListNode(String name1, String name2, int count) {
        this.name1 = name1;
        this.name2 = name2;
        this.count = count;
    }

    // ----------------------------------------------------------
    /**
     * get name
     * @return String name
     */
    public String getName1() {
        return name1;
    }

    // ----------------------------------------------------------
    /**
     * get name 2
     * @return String name2
     */
    public String getName2() {
        return name2;
    }

    // ----------------------------------------------------------
    /**
     * get count
     * @return int count
     */
    public int getCount() {
        return count;
    }

    // ----------------------------------------------------------
    /**
     * set name 1
     * @param name1 ~~
     */
    public void setName1(String name1) {
        this.name1 = name1;
    }

    // ----------------------------------------------------------
    /**
     * set name 2
     * @param name2 ~~
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }

    // ----------------------------------------------------------
    /**
     * set count
     * @param count ~~
     */
    public void setCount(int count) {
        this.count = count;
    }

}
