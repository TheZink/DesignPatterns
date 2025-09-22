import java.util.ArrayList;
import java.util.List;


public class Directory implements FileSystemElement {
    private String name;
    private List<FileSystemElement> files = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void AddElement(FileSystemElement element){
        files.add(element);
    }

    @Override
    public void accept(FileSystemVisitor visitor){
        visitor.visit(this);

        for(FileSystemElement file: files){
            file.accept(visitor);
        }
    }
}
