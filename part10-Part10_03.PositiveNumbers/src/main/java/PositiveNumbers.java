
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(4);
        integers.add(3);
        integers.add(2);
        integers.add(1);
        integers.add(-3);
        integers.add(-5);
        integers.add(-8);

        // test your method here

        System.out.println(positive(integers));
    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(integer -> integer > 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
