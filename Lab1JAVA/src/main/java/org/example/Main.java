public class Book {
    // Властивості книги
    private String title;
    private String author;
    private String isbn;
    private int year;

    // Конструктор для ініціалізації книги
    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    // Гетери та сетери для доступу до властивостей книги
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
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
