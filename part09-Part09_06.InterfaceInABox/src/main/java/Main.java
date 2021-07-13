
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Book book1 = new Book("Mark Feher", "Dvadsat Pat", 3);

        CD cd1 = new CD("Mark", "Feher", 1973);

        Box box = new Box(10);

        System.out.println(book1);
        System.out.println(cd1);

        box.add(book1);
        box.add(cd1);

        System.out.println(box);

    }

}
