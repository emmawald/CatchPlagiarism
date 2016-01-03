package catchPlagiarist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// -------------------------------------------------------------------------
/**
 * File processing demonstration Should print all 6 word strings in the
 * documents
 *
 * @author emmawald
 * @version Nov 10, 2015
 */
public class FileProcDemo
{

    /**
     * Main method Prints all 6 word strings in files
     *
     * @param args
     *            ~~command line arguments
     */
    public static void main(String[] args)
    {

        File[] listFile;
        ArrayList<ArrayListNode> treeList = new ArrayList<ArrayListNode>();
        BinarySearchTree<String> tree;
        int length = 6;

        File folder = new File(args[0]);

        if (Integer.parseInt(args[1]) > 0)
        {
            length = Integer.parseInt(args[1]);
        }
        else
        {
            throw new IllegalArgumentException(
                "The value for length of word sequences is not valid, use preset value 6");
        }

        if (folder.isDirectory())
        {
            listFile = folder.listFiles();
            for(File f : listFile) {
                tree = new BinarySearchTree<String>();
                try
                {
                    BufferedReader b = new BufferedReader(new FileReader(f));
                    String line = "";
                    try
                    {
                        while((line = b.readLine()) != null) {
                            Scanner file = new Scanner(line);
                            QueueList<String> queue = new QueueList<String>();
                            for (int j1 = 0; j1 < length; j1++)
                            {
                                if (file.hasNext())
                                {
                                    queue.enqueue(file.next());
                                }
                            }

                            String s = queue.toString();
                            //System.out.println(s);
                            tree.insert(s);

                            while (file.hasNext())
                            {
                                queue.enqueue(file.next());
                                queue.dequeue();
                                //System.out.println(s);
                                s = queue.toString();
                                tree.insert(s);
                            }

                        }
                    }
                    catch (IOException e)
                    {
                        System.out.println("Line not read");
                    }
                }
                catch (FileNotFoundException e)
                {
                    System.out.println("Buffered reader not created");
                }

                ArrayListNode node = new ArrayListNode(tree, f.getName());
                treeList.add(node);

            }
        }
        else
        {
            throw new IllegalArgumentException(
                "The file input is not a directory");
        }

        int threshold = 100;
        if (Integer.parseInt(args[1]) > 0)
        {
            threshold = Integer.parseInt(args[2]);
        }
        else
        {
            throw new IllegalArgumentException(
                "The value for length of word sequences is not valid, use preset value 100");
        }

        System.out.println("Number of Common " + length + " Word Sequences: ");

        Compare compare = new Compare(treeList, threshold);
        compare.count();

    }

}
