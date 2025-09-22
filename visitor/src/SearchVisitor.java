import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String searchString;
    private List<File> files = new ArrayList<>();

    public SearchVisitor(String searchString){
        this.searchString = searchString;
    }

    public void visit(File file){
        if (file.getName().contains(searchString)){
            files.add(file);
        }
    }

    public void visit(Directory directory){};

    public List<File> getFiles(){
        return files;
    }

}
