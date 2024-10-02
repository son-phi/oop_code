import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Thêm sách
    public void addBook(Book book) {
        books.add(book);
    }

    // Xóa sách theo ISBN
    public void removeBook(String ISBN) {
        books.removeIf(book -> book.getISBN().equals(ISBN));
    }

    // Cập nhật sách
    public void updateBook(String ISBN, Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(ISBN)) {
                books.set(i, updatedBook);
                break;
            }
        }
    }

    // Tìm kiếm sách theo tên
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Hiển thị tất cả sách
    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
