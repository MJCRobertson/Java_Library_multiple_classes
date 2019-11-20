import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MemberTest {

    private Member member;
    private Book borrowedBook;

    @Before
    public void before(){
        member = new Member();
        borrowedBook = new Book("LOTR", "J.R.R. Tolkien", "Fantasy");
    }

    @Test
    public void memberStartsWithNoBooks(){
        assertEquals(0, borrowedBook.countBooksLent())
    }
}
