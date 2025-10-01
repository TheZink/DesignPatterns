import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        boolean running = true;
        Recommendation clonedRec = null;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recommendation> recommendations = new ArrayList<>();

        // Copilot generated bunch of books for testing

        Book book1 = new Book("J.K. Rowling", "Harry Potter", "Fantasy", 1997);
        Book book2 = new Book("J.R.R. Tolkien", "The Hobbit", "Fantasy", 1937);
        Book book3 = new Book("C.S. Lewis", "The Lion, the Witch and the Wardrobe", "Fantasy", 1950);
        Book book4 = new Book("Patrick Rothfuss", "The Name of the Wind", "Fantasy", 2007);

        Book book5 = new Book("Isaac Asimov", "Foundation", "Science Fiction", 1951);
        Book book6 = new Book("Frank Herbert", "Dune", "Science Fiction", 1965);
        Book book7 = new Book("Philip K. Dick", "Do Androids Dream of Electric Sheep?", "Science Fiction", 1968);

        Book book8 = new Book("Suzanne Collins", "The Hunger Games", "Dystopian", 2008);
        Book book9 = new Book("Veronica Roth", "Divergent", "Dystopian", 2011);
        Book book10 = new Book("John Green", "The Fault in Our Stars", "Young Adult", 2012);

        Recommendation fantasy = new Recommendation("Fantasy audience");
        Recommendation scifi = new Recommendation("Sci-fi");
        Recommendation dystopia = new Recommendation("Dystopian Enthusiasts");
        Recommendation fiction = new Recommendation("Popular Fiction Fans");

        // Add books to specific audience

        fantasy.addBook(book1);
        fantasy.addBook(book2);
        fantasy.addBook(book3);
        fantasy.addBook(book4);
        
        scifi.addBook(book5);
        scifi.addBook(book6);
        scifi.addBook(book7);
        
        dystopia.addBook(book8);
        dystopia.addBook(book9);
        
        fiction.addBook(book10);

        // Add audience to the list

        recommendations.add(fantasy);
        recommendations.add(scifi);
        recommendations.add(dystopia);
        recommendations.add(fiction);

         System.out.println("\nWelcome to the book recommendation program.");

        while (running){
            System.out.println("\nPlease select a command:\n" + 
                                "1. View available recommendations\n" +
                                "2. Clone a recommendation\n" + 
                                "3. View cloned recommendation\n" + 
                                "4. Modify cloned recommendation\n" +
                                "5. Save new recommendations\n" + 
                                "6. Exit program\n");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1: // Print available recommendations and their books
                    System.out.println("Available recommendations:");
                    for (int i = 0; i < recommendations.size(); i++) {
                        System.out.println("\n" + (i + 1) + ". " + recommendations.get(i).getAudience());
                        for (Book book : recommendations.get(i).getBooks()) {
                            System.out.println("  - " + book.getTitle() +
                                ", author: " + book.getAuthor() +
                                " (" + book.getGenre() + ", " + book.getYear() + ")");
                        }
                    }
                    break;

                case 2: // Clone a selected recommendation
                    System.out.println("Select a recommendation to clone:");
                    for (int i = 0; i < recommendations.size(); i++) {
                        System.out.println((i + 1) + ". " + recommendations.get(i).getAudience());
                    }
                    int cloneIndex = scanner.nextInt() - 1;
                    clonedRec = recommendations.get(cloneIndex).clone();
                    System.out.println("Successfully cloned recommendation: " + recommendations.get(cloneIndex).getAudience());
                    break;

                case 3: // Print cloned recommendation 
                
                    if (clonedRec != null){  
                        System.out.println("Cloned recommendation: " + clonedRec.getAudience());
                    
                            // Print books
                            for (Book book : clonedRec.getBooks()){
                                    System.out.println("  - " + book.getTitle() + 
                                                        ", author: " + book.getAuthor() + 
                                                        " (" + book.getGenre() + ", " + book.getYear()+ ")");
                                }
                    } else {
                        System.out.println("You need to clone recommendation first");
                    }
    
                    break;

                case 4: // Modify cloned recommendation. This action is hard-coded for demonstration.
                    System.out.println("Added new book to the cloned recommendation");
                    clonedRec.addBook(new Book("Jukka", "Suunnittelumalli", "Ohjelmointi", 2025));
                    break;

                case 5: // Save new recommendations. This action is hard-coded for demonstration.
                    Book book11 = new Book("Hard coded author", "Hard coded title", "Hard coded genre", 2025);
                    Recommendation hardcoded = new Recommendation("Hard coded recommendation");
                    hardcoded.addBook(book11);
                    recommendations.add(hardcoded);
                    break;
                
                case 6:
                    System.out.println("Thank you! Bye!");
                    running = false;

                default:
                    System.out.println("Invalid input. Please try again");;
            }
        }

    scanner.close();
    }
}
