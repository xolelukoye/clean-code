package practice3.virtual_library;

public class BookProxy {

    private Book book;
    private boolean loaded = false;

    public BookProxy(Book book) {
        this.book = book;
    }

    public String getContent() {
        if (!loaded) {
            loaded = true;
        }
        return book.getContent();
    }
}
