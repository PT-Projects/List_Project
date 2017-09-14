import java.util.Arrays;

/**
 * Created by rritz on 9/26/2014.
 */
public class SortedList <E extends Comparable<E>> extends AbstractList<E>
{
    /**
     * Constructs a new SortedList with an allocation size of maxItems
     * @param maxItems the allocation size of the list
     */
    public SortedList(int maxItems) {
        theList = (E[]) new Comparable[maxItems];
    }

    /**
     * Adds obj to the list in ascending sorted order. Size is updated.
     * @param obj the object to add to the list
     * @return true if the add is successful, false otherwise
     */
    public boolean add(E obj) {
        if(isFull())
            return false;

        // . . .
        // Be sure to update the size instance field when you add a new element!

        return true;
    }

    /**
     * Return the index where obj is found in the list or negative number if not found
     * @param obj the object to search for in the list
     * @return the index where obj is found in the list or negative number if not found
     */
    public int indexOf(E obj) {
        return Arrays.binarySearch(theList, 0, size, obj);
    }
}
