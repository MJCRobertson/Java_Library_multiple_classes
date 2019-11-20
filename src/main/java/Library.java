import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }


    public int countBookStock() {
       return this.books.size();
    }

    public void addBookToStock(Book books) {
        if(this.books.size() < this.capacity) {
            this.books.add(books);
        }
    }
}
