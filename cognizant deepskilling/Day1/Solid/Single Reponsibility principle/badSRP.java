class Book {
    String title;
    String author;
    String text;

    void printTextToConsole() {
        System.out.println(text);
    }
}

public class badSRP{
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Clean Code";
        b.author = "Robert C. Martin";
        b.text = "Programming best practices.";
        b.printTextToConsole();
    }
}

