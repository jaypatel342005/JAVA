class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public void display() {
        System.out.println("Author: " + authorName);
    }
}

class BookPublication extends Book {
    private String title;
    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;
    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }
}

public class Lab6_2 {
    public static void main(String[] args) {
        
        String authorName = args[0];
        String book =args[1];

        for (int i = 1; i < args.length; i += 2) {
            String publicationType = args[i];
            String title = args[i + 1];
            Book publication;
            if (publicationType.equalsIgnoreCase("book")) {
                publication = new BookPublication(authorName, title);
            } else if (publicationType.equalsIgnoreCase("paper")) {
                publication = new PaperPublication(authorName, title);
            } else {
                System.out.println("Invalid publication type: " + publicationType);
                continue;
            }
            publication.display();
            System.out.println();
        }
    }
}
