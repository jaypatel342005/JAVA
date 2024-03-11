import java.util.Scanner;

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

public class Lab6_2_2 {
    public static void main(String[] args) {
        System.out.println("enter the book or paper");
        Scanner scc= new Scanner (System.in);
        String  n = scc.nextLine();
        Book book1 ;
        if (n.equalsIgnoreCase("book")) {
            book1 = new BookPublication("no","no");
        }
        else if (n.equalsIgnoreCase(" Paper")) {
            book1 = new PaperPublication ("yas","yas");
        }
        else {
            book1 = new Book("ok");
        }
        book1.display();

        
        }
    }
