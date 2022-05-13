
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter name : ");
    String name = scanner.next();
    System.out.print("Enter number : ");
    String number = scanner.next();

        add(name,number);
    System.out.println(phoneBook);

    System.out.println("Search..");
    System.out.print("Enter name to search : " );
    String nameSearch = scanner.next();
        get(nameSearch);
}
    public static final Map<String, String> phoneBook = new HashMap<>();

    public static void add(String phoneNumber, String name) {
        phoneBook.putIfAbsent(phoneNumber, name);
    }

    public static void get(String name) {
        phoneBook.entrySet().stream()
                .filter(s -> s.getKey().equals(name))
                .forEach(s -> System.out.printf("Name: %s%nPhone Number: %s%s",
                        name,
                        s.getValue(),
                        System.lineSeparator()));
    }
}