public class SorterContext {
    private SortingStrategy strategy;

    public SorterContext(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortingStrategy strategy){
        this.strategy = strategy;
    }

    public void processSorting(int[] array){
        strategy.processSorting(array);
    } 
}
