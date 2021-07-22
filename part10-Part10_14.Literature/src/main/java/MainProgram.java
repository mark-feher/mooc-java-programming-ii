
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookCollection = new ArrayList<>();

        while (true) {
            // inputting bookName
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();

            // if bookName is empty, then exit the program and print out statistics
            if (bookName.isEmpty()) {
                System.out.println(bookCollection.size() + " books in total.");
                // turning bookCollection into a stream
                bookCollection.stream()
                        // sorting based on bookAgeRecommendation then on bookName
                        .sorted(Comparator.comparing(Book::getBookAgeRecommendation)
                        .thenComparing(Book::getBookName))
                        // outputting each book based on before-set criteria
                        .forEach(book -> System.out.println(book));
                break;
            }

            // input bookAge recommendation
            System.out.print("Input the age recommendation: ");
            int bookAgeRecommendation = Integer.parseInt(scanner.nextLine());

            // add book into the collection
            bookCollection.add(new Book(bookName, bookAgeRecommendation));
        }
    }

}
