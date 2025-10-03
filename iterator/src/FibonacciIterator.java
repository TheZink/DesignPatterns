package src;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer>{
    private int count = 0;
    private int maxCount;
    private int prev = 1;
    private int current = 1;

    public FibonacciIterator(int maxCount){
        this.maxCount = maxCount;
    }

    @Override
    public boolean hasNext(){
        // If maxCount is negative value, treat as infinite sequence
        return maxCount < 0 || count < maxCount;
    }

    @Override
    public Integer next(){
        int fibonacci;

        if (count == 0 || count == 1){
            fibonacci = 1;
        } else {
            fibonacci = prev + current;
            prev = current;
            current = fibonacci;
        }

        count++;
        return fibonacci;
    }
}
