import java.util.ArrayList;

public class Member {

    private ArrayList<Book> borrowedBooks;

    public Member(){
        this.borrowedBooks = ArrayList<Book>();
    }

    public void countBooksLent(){
        return this.borrowedBooks.size();
    }
}
