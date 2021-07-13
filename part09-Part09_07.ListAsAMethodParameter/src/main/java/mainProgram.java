import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<String> list = new ArrayList<>();

        list.add("Mark");
        list.add("Matus");

        System.out.println(returnSize(list));


    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    public static int returnSize(List<String> list) {
        return list.size();
    }
}
