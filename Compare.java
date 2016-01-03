package catchPlagiarist;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author emmawald
 * @version Nov 28, 2015
 */
public class Compare
{

    /**
     * create array list
     */
    ArrayList<ArrayListNode> array;

    /**
     * threshold
     */
    int threshold;


    // ----------------------------------------------------------
    /**
     * Create a new Compare object.
     *
     * @param array
     *            ~~
     * @param threshold
     */
    public Compare(ArrayList<ArrayListNode> array, int threshold)
    {
        this.array = array;
        this.threshold = threshold;
    }


    // ----------------------------------------------------------
    /**
     * for loops to compare the array items
     */
    public void count()
    {

        ArrayList<AnotherArrayListNode> a =
            new ArrayList<AnotherArrayListNode>();

        for (int i = 0; i < array.size() - 1; i++)
        {

            BinarySearchTree<String> tree = array.get(i).getTree();

            for (int j = i + 1; j < array.size(); j++)
            {

                int count = 0;

                BinarySearchTree<String> search = array.get(j).getTree();
                count = tree.traversal(search);

                AnotherArrayListNode last = new AnotherArrayListNode(
                    array.get(i).getFileName(),
                    array.get(j).getFileName(),
                    count);

                if (count >= threshold)
                {
                    insertSort(last, a);
                }

            }

        }

        System.out.println();

        for (int i = 0; i < a.size; i++)
        {
            System.out.println(
                a.get(i).getName1() + ", " + a.get(i).getName2() + ": "
                    + a.get(i).getCount());
        }

    }


    // ----------------------------------------------------------
    /**
     * insertion sort of each count
     *
     * @param last
     *            ~~
     * @param a
     *            ~~
     */
    public void insertSort(
        AnotherArrayListNode last,
        ArrayList<AnotherArrayListNode> a)
    {

        int l = 0;
        while (l < a.size && a.get(l).getCount() < last.getCount())
        {
            l++;
        }
        if (a.size == 0)
        {
            l = 0;
        }
        a.add(l, last);

    }

}
