
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("end")) {
                break;
            }

            inputs.add(userInput);
        }

        double average = inputs.stream()
                .mapToInt(string -> Integer.valueOf(string)) //  lambda can be replaced by Integer::valueOf
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + average);
    }
}
