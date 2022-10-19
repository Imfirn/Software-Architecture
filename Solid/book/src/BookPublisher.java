

import java.util.List;

public class BookPublisher extends ToFile {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        ToFile.printToFile(book);
    }
}
