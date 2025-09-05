public class BubbleSort implements SortingStrategy{
    public void processSorting(int[] array){
        
        // Bubble Sort
        // https://www.geeksforgeeks.org/dsa/bubble-sort-algorithm/
        
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < array.length - 1; i++){
            swapped = false;

            for (j = 0; j < array.length - i - 1; j++){
                
                if(array[j] > array[j] + 1){
                    
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            
            }

            if (swapped == false){
                break;
            }
        }
    }

}
