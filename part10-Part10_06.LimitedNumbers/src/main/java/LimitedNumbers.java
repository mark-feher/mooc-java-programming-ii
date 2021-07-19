
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        while (true) {
            int userInput = Integer.parseInt(scanner.nextLine());

            if (userInput < 0) {
                break;
            }

            integers.add(userInput);
        }

        integers.stream().filter(integer -> (integer >= 1 && integer <= 5))
                .forEach(integer -> System.out.println(integer));
    }
}
