
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positives = new ArrayList<>();

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                System.out.println(average(positives));
                if (positives.isEmpty()) {
                    System.out.println("Cannot calculate the average");
                }
                break;
            }

            if (input > 0) {
                positives.add(input);
            }
        }
    }

    static double average(ArrayList<Integer> positives) {
        int sum = 0;

        for (Integer integer: positives) {
            sum += integer;
        }

        return (double) sum / positives.size();
    }
}

