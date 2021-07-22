
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Double> literacy = new ArrayList<>();

        try {
            // Load csv file row by row into a stream
            Files.lines(Paths.get("literacy.csv"))
                    // split each line by comma "," into parts
                    .map(line -> line.split(","))
                    // compare each part based on the literacy
                    // this can be replaced by Comparator.comparing(p -> p[5])
                    .sorted((p1, p2) -> p1[5].compareTo(p2[5]))
                    // display everything in this format:
                    //  Country (year), sex
                    //  in sex comes the problem that it's in (%), so we have to split the string
                    // and trim the (%) part
                    //  , literacy in %
                    .forEach(
                            row -> System.out.println(row[3] + " ("
                            + row[4] + "), " + row[2].split(" ")[1].trim()
                                            + ", " + row[5]
                                    )
                    );
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
