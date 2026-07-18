package practice3.virtual_library;

public class Main {

    public static void main(String[] args) {

        Book book = new Book.BookBuilder()
                .setTitle("War and Peace")
                .setAuthor("LeoTolstoy")
                .setDescription("A historical novel about the Napoleonic Wars.")
                .build();

        BookProxy proxy = new BookProxy(book);

        String content = proxy.getContent();
        System.out.println("Content of the book: " + content);
    }
}
