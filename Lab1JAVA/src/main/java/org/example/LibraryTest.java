import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Sample Book", "John Doe", "1234567890", 2022);

        library.addBook(book);

        assertEquals(1, library.getBooks().size());
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        Book book = new Book("Sample Book", "John Doe", "1234567890", 2022);

        library.addBook(book);
        library.removeBook("1234567890");

        assertEquals(0, library.getBooks().size());
    }

    @Test
    public void testSearchBook() {
        Library library = new Library();
        Book book = new Book("Sample Book", "John Doe", "1234567890", 2022);

        library.addBook(book);

        assertEquals("Sample Book", library.searchBook("Sample Book"));
    }
}
