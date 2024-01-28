package Baitap2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class BookManager {
    public static Map<Author, Integer> countBooksByAuthor(List<Book> books) {
        Map<Author, Integer> authorBookCount = new HashMap<>();
        // dung vong lap for each cho Book
        for (Book book : books) {
            Author author = book.getAuthor();
            // If the author is already in the map,increment the count,otherwise,add the author to the map
            if (authorBookCount.containsKey(author)) {
                int count = authorBookCount.get(author);
                authorBookCount.put(author, count + 1);
            } else {
                authorBookCount.put(author, 1);
            }
        }
        return authorBookCount;
    }
}

