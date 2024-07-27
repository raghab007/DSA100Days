package TrySomethingNew;
import java.util.Arrays;
import java.util.Scanner;

public class User {
    String name;
    int age;
    String address;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter username:");
            String userName = scanner.nextLine();
            int age;
            while (true) {
                try {
                    System.out.println("Enter age:");
                    age = scanner.nextInt();
                    break;
                } catch (Exception exception) {
                    System.out.println("Please enter valid number");
                }
            }
            System.out.println("Enter address: ");
            String address = scanner.nextLine();
            User user = new User();
            user.name = userName;
            user.address = address;
            user.age = age;
            Repository.addUser(user);
            System.out.println("Want to add others");
            String wantToAdd = scanner.nextLine().toLowerCase();
            if (!wantToAdd.equals("y")) {
                break;

            }
            System.out.println("Thank you for using our system");
            System.out.println(Arrays.toString(Repository.getUsers().toArray()));
        }

    }
}
