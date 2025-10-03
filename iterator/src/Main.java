package src;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fibonacci = new FibonacciSequence(10);
        Iterator<Integer> iterator = fibonacci.iterator();

        System.out.println("\nFibonacci print");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
