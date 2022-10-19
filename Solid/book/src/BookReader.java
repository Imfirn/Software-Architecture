
import java.util.List;

public class BookReader extends ToScreen {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        ToScreen.printToScreen(book);
    }
}
