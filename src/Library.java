import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private Map<Member, List<Book>> issuedBooks = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    public void issueBook(Member member, int bookId) throws BookNotAvailableException {
        Book book = searchBook(bookId);

        if (book == null)
            throw new BookNotAvailableException("Book not found!");

        if (book.isIssued())
            throw new BookNotAvailableException("Book already issued!");

        issuedBooks.putIfAbsent(member, new ArrayList<>());

        if (issuedBooks.get(member).size() >= member.getMaxBooks())
            throw new BookNotAvailableException("Limit exceeded!");

        book.issue();
        issuedBooks.get(member).add(book);

        System.out.println("Book issued successfully!");
    }

    public void returnBook(Member member, int bookId) {
        List<Book> list = issuedBooks.get(member);

        if (list != null) {
            for (Book b : list) {
                if (b.getId() == bookId) {
                    b.returnBook();
                    list.remove(b);
                    System.out.println("Book returned successfully!");
                    return;
                }
            }
        }
        System.out.println("Book not found in issued list!");
    }

    public void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }
}