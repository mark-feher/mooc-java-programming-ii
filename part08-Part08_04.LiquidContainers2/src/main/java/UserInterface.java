import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Container container1;
    private Container container2;

    public UserInterface(Scanner scanner, Container container1, Container container2) {
        this.scanner = scanner;
        this.container1 = container1;
        this.container2 = container2;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + container1.contains()+ "/100");
            System.out.println("Second: " + container2.contains()+ "/100");
            String input = scanner.nextLine();

            String[] inputParts = input.split(" ");

            if(inputParts[0].equals("quit")) {
                break;
            }
            if (inputParts[0].equals("add")) {
                container1.add(Integer.parseInt(inputParts[1]));
            }
            if (inputParts[0].equals("move")) {
                if (container1.contains() >= Integer.parseInt(inputParts[1])) {
                    container1.remove(Integer.parseInt(inputParts[1]));
                    container2.add(Integer.parseInt(inputParts[1]));
                } else {
                    int liquidInFirstCont = container1.contains();
                    container1.remove(liquidInFirstCont);
                    container2.add(liquidInFirstCont);
                }
            }
            if (inputParts[0].equals("remove")) {
                container2.remove(Integer.parseInt(inputParts[1]));
            }
        }
    }
}
