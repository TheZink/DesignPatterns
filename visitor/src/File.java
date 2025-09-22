public class File implements FileSystemElement{
    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public double getSize(){
        return size;
    }

    @Override
    public void accept(FileSystemVisitor visitor){
        visitor.visit(this);
    }
}
