import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private ArrayList<Book> books; // Масив для зберігання книг

    // Конструктор для ініціалізації пустої бібліотеки
    public Library() {
        books = new ArrayList<>();
    }

    // Додавання нової книги до бібліотеки
    public void addBook(Book book) {
        books.add(book);
    }

    // Видалення книги за її ISBN
    public void removeBook(String isbn) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(isbn)) {
                iterator.remove();
                return;
            }
        }
        System.out.println("Книга з ISBN " + isbn + " не знайдена.");
    }

    // Пошук книги за її назвою
    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Знайдено книгу: " + book.getTitle() + " (Автор: " + book.getAuthor() +
                        ", ISBN: " + book.getIsbn() + ", Рік видання: " + book.getYear() + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Книга з назвою '" + title + "' не знайдена.");
        }
    }

    // Показ усіх книг у бібліотеці
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("У бібліотеці немає жодної книги.");
        } else {
            System.out.println("Книги у бібліотеці:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " (Автор: " + book.getAuthor() +
                        ", ISBN: " + book.getIsbn() + ", Рік видання: " + book.getYear() + ")");
            }
        }
    }
}
