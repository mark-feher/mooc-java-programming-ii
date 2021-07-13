
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LiquidContainer liquidContainer1 = new LiquidContainer();
        LiquidContainer liquidContainer2 = new LiquidContainer();
        UserInterface ui = new UserInterface(scanner, liquidContainer1, liquidContainer2);


        ui.start();
    }

}
