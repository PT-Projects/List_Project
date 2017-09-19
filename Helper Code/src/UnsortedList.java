/**
 * Created by rritz on 9/26/2014.
 */
public class UnsortedList<E> extends AbstractList<E>
{
    /**
     * Constructs a new UnsortedList with an allocation size of maxItems
     * @param maxItems the allocation size of the list
     */
    public UnsortedList(int maxItems) {
        theList = (E[]) new Object[maxItems];
    }

    /**
     * Adds obj to the end of the list. Size is updated.
     * @param obj the object to add to the list
     * @return true if the add is successful, false otherwise
     */
    public boolean add(E obj) {

        if(isFull())
            return false;

        int i = size();
        theList[i] = obj;
        size++;

        return true;
    }

    /**
     * Return the index where obj is found in the list or -1 if not found
     * @param obj the object to search for in the list
     * @return the index where obj is found in the list or -1 if not found
     */
    public int indexOf(E obj) {

        for(int i = 0; i < size(); i++)
        {
            if(theList[i].equals(obj))
                return i;
        }

        return -1;

    }
}
