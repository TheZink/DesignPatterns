public class Book implements Prototype {
    private String author;
    private String title;
    private String genre;
    private int year;

    public Book(String author, String title, String genre, int year){
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public void setAuthor(String authorString){
        this.author = authorString;
    }

    public void setTitle(String titleString){
        this.title = titleString;
    }

    public void setGenre(String genreString){
        this.genre = genreString;
    }

    public void setYear(int yearInt){
        this.year = yearInt;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public int getYear(){
        return year;
    }

    @Override
    public Book clone(){
        return new Book(this.author, this.title, this.genre, this.year);
    }

}
