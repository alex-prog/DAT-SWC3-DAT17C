package week2.ADT;

/**
 * Created by coag on 06-09-2018.
 */
public interface MyList<T> {

    /**
     * Returns the size of the list (how many elements are in the list
     * @return
     */
    int size();
    void add();
    T get(int index);
    T remove(int index);
    String toString();
}
