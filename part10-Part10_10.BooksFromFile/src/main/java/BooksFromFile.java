import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        System.out.println(readBooks("file.txt"));

    }

    public static List<Book> readBooks(String file) {
        ArrayList<Book> bookList = new ArrayList<>();

        try {
            // reading the file.txt line by line
             Files.lines(Paths.get(file))
                    // splitting the row into parts on "," characeter
            .map(row -> row.split(","))
                    // deleting the split rows that have less than 4 parts
                    // (Book name, release year, pages, writer name) = 4 parts
//            .filter(parts -> parts.length >= 4)
                    // creating book object from parts
            .map(parts -> new Book(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]))
                    // add books to the bookList
                    .forEach(book -> bookList.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return bookList;
    }

}
