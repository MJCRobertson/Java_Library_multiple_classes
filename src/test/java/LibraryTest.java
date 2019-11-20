import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book books;

    @Before
    public void before(){
        library = new Library(2);
        books = new Book("LOTR", "J.R.R. Tolkien", "Fantasy");
    }

    @Test
    public void canCountBookStockLevel(){
        assertEquals(0, library.countBookStock());
    }

    @Test
    public void canAddABook() {
        library.addBookToStock(books);
        assertEquals(1, library.countBookStock());
    }

    @Test
    public void cannotAddIfCapacityAtMax(){
        library.addBookToStock(books);
        library.addBookToStock(books);
        library.addBookToStock(books);
        assertEquals(2, library.countBooksLent());
    }
}
