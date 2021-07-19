
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("")) {
                break;
            }

            inputs.add(userInput);

            //


        }

        inputs.stream().forEach(string -> System.out.println(string));

    }
}
