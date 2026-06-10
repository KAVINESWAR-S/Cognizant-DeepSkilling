class Book {
    String title;
    String author;
    String text;
}

class BookPrinter {
    void print(Book book) {
        System.out.println(book.text);
    }
}

public class GoodSRP {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Clean Code";
        b.author = "Robert C. Martin";
        b.text = "Programming best practices.";
        
        BookPrinter printer = new BookPrinter();
        printer.print(b);
    }
}
