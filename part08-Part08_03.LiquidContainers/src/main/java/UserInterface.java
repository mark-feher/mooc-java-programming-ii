import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private LiquidContainer liquidContainer1;
    private LiquidContainer liquidContainer2;

    public UserInterface(Scanner scanner, LiquidContainer liquidContainer1, LiquidContainer liquidContainer2) {
        this.scanner = scanner;
        this.liquidContainer1 = liquidContainer1;
        this.liquidContainer2 = liquidContainer2;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + liquidContainer1.getAmountOfLiquid()+ "/100");
            System.out.println("Second: " + liquidContainer2.getAmountOfLiquid()+ "/100");
            String input = scanner.nextLine();

            String[] inputParts = input.split(" ");

            if(inputParts[0].equals("quit")) {
                break;
            }
            if (inputParts[0].equals("add")) {
                liquidContainer1.addAmount(Integer.parseInt(inputParts[1]));
            }
            if (inputParts[0].equals("move")) {
                if (liquidContainer1.getAmountOfLiquid() >= Integer.parseInt(inputParts[1])) {
                    liquidContainer1.removeAmount(Integer.parseInt(inputParts[1]));
                    liquidContainer2.addAmount(Integer.parseInt(inputParts[1]));
                } else {
                    int liquidInFirstCont = liquidContainer1.getAmountOfLiquid();
                    liquidContainer1.removeAmount(liquidInFirstCont);
                    liquidContainer2.addAmount(liquidInFirstCont);
                }
            }
            if (inputParts[0].equals("remove")) {
                liquidContainer2.removeAmount(Integer.parseInt(inputParts[1]));
            }
        }
    }
}
