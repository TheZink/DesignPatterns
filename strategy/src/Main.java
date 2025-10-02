import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] smallArray = randomGenerator(3000);
        int[] largeArray = randomGenerator(10000000);

        runAlgorithm("BubbleSort", new BubbleSort(), Arrays.copyOf(smallArray, smallArray.length), Arrays.copyOf(largeArray, largeArray.length));
        runAlgorithm("Quick sort", new QuickSort(), Arrays.copyOf(smallArray, smallArray.length), Arrays.copyOf(largeArray, largeArray.length));
        runAlgorithm("InsertionSort", new InsertionSort(), Arrays.copyOf(smallArray, smallArray.length), Arrays.copyOf(largeArray, largeArray.length));
    }

    // Method generate random number and add to the list
    public static int[] randomGenerator(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(999);
        }

        return array;
    }

    // Method test algorithm, measure time and print result to the console
    public static void runAlgorithm(String name, SortingStrategy strategy, int[] array1, int[] array2){
        SorterContext sorter = new SorterContext(strategy);

        // Test small List
        long startTime1 = System.nanoTime();
        sorter.processSorting(array1);
        long endTime1 = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;

        System.out.println("Algorithm " + name + " sorting small list complete in:\n" + 
        "Nanoseconds: " +totalTime1 + ".\n" +
        "Milliseconds: " + (totalTime1 / 1_000_000.0 ) + ".\n" +
        "Seconds: " + (totalTime1 / 1_000_000_000.0 )  + "\n");

        // Test large list
        long startTime2 = System.nanoTime();
        sorter.processSorting(array2);
        long endTime2 = System.nanoTime();
        long totalTime2 = endTime2 - startTime2;

        System.out.println("Algorithm " + name + " sorting large list complete in:\n" + 
        "Nanoseconds: " +totalTime2 + ".\n" +
        "Milliseconds: " + (totalTime2 / 1_000_000.0 ) + ".\n" +
        "Seconds: " + (totalTime2 / 1_000_000_000.0 )  + "\n");

    }

}
