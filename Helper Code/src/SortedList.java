import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by rritz on 9/26/2014.
 */
public class SortedList <E extends Comparable<E>> extends AbstractList<E> {
    /**
     * Constructs a new SortedList with an allocation size of maxItems
     *
     * @param maxItems the allocation size of the list
     */
    public SortedList(int maxItems) {
        theList = (E[]) new Comparable[maxItems];
    }

    /**
     * Adds obj to the list in ascending sorted order. Size is updated.
     *
     * @param obj the object to add to the list
     * @return true if the add is successful, false otherwise
     */
    public boolean add(E obj) {
        if (isFull()) {
            return false;
        } else {

            //Adds New Obj to List
            theList[size()] = obj;
            size++;

            //Sorts List
            ArrayList<E> sortList = new ArrayList<>();
            for(int x = 0; x < size(); x++){
                sortList.add(theList[x]);
            }
            Collections.sort(sortList);

            //Sets theList to sortList
            for(int x = 0; x < size(); x++){
                theList[x] = sortList.get(x);
            }

        }

        return true;

    }

    /**
     * Return the index where obj is found in the list or negative number if not found
     *
     * @param obj the object to search for in the list
     * @return the index where obj is found in the list or negative number if not found
     */
    public int indexOf(E obj) {
        return Arrays.binarySearch(theList, 0, size, obj);
    }
}