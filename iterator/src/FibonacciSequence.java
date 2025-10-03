package src;

import java.util.Iterator;

public class FibonacciSequence implements Sequence {
    private int count;

    public FibonacciSequence(int count){
        this.count = count;
    }
    
    @Override
    public Iterator<Integer> iterator(){
        return new FibonacciIterator(count);
    }
}
