public class SizeCalculatorVisitor implements FileSystemVisitor{
    private int size_amount = 0;

    @Override
    public void visit(File file){
        size_amount += file.getSize();
    }

    public void visit(Directory directory){};

    public int getTotalSize(){
        return size_amount;
    }
}
