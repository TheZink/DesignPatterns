import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Prototype {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targerAudience){
        this.targetAudience = targerAudience;
        this.books = new ArrayList<>();
    }

    public void setAudience(String targetAudienceString){
        this.targetAudience = targetAudienceString;
    }

    public String getAudience(){
        return targetAudience;
    }

    public List<Book> getBooks(){
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    @Override
    public Recommendation clone(){
        Recommendation cloneBooks = new Recommendation(targetAudience);

        for (Book book : this.books){
            cloneBooks.addBook(book.clone());
        }

        return cloneBooks;
    }
}
