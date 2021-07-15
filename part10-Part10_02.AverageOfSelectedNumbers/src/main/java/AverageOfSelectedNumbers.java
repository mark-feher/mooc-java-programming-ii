
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("end")) {
                break;
            }
            if (userInput.isEmpty()) {
                continue;
            }
            inputs.add(userInput);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String userInput = scanner.nextLine();

        if (userInput.equals("p")) {
            double average = inputs.stream()
                    .mapToInt(string -> Integer.valueOf(string))    // map the stream of strings into integers
                    .filter(integer -> integer > 0) // Filter out the positive numbers
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        } else if (userInput.equals("n")) {
            double average = inputs.stream()
                    .mapToInt(string -> Integer.valueOf(string))    // map the stream of strings into integers
                    .filter(integer -> integer < 0) // Filter out the negative numbers
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }

        // note, if I choose e.g. to calculate negative avg when inputs is empty,
        // I get an exception "No value present at.."
        // "else if" seems to fix it
    }
}
