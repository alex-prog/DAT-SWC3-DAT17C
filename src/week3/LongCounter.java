package week3;

/**
 * Created by coag on 13-09-2018.
 */
public class LongCounter {
    private volatile long counter;

    public synchronized void increment(){
        counter++;
    }

    public void decrement(){
        synchronized (this){
            counter--;
        }
    }

    public long get(){
        return counter;
    }

}
