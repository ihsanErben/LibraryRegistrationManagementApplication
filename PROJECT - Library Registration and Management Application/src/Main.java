
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library L = new Library();
        Scanner input = new Scanner(System.in);
        int go = 1;
        while (go != 0) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("1 - Librarian");
            System.out.println("2 - Library Member");
            System.out.print("Choose an option: ");
            int option = input.nextInt();
            System.out.println("--------------------------------------------------");
            switch (option) {
                case 0:
                    go = 0;
                    break;
                case 1:
                    System.out.print("Librarian id: ");
                    String id = input.next();
                    System.out.print("Librarian password: ");
                    String password = input.next();
                    if (new Login().login(id, password)) {
                        int a = 1;
                        while (a == 1) {
                            System.out.println("--------------------------------------------------");
                            System.out.print("1)add book    --  ");
                            System.out.print("2)remove book    --  ");
                            System.out.println("3)print all books");
                            System.out.print("4)add member  --  ");
                            System.out.print("5)remove member  --  ");
                            System.out.println("6)print all members");
                            System.out.print("Choose an option: ");
                            int option2 = input.nextInt();
                            System.out.println("--------------------------------------------------");
                            switch (option2) {
                                case 0:
                                    a = 0;
                                    break;
                                case 1:
                                    L.add_book();
                                    break;
                                case 2:
                                    L.remove_book();
                                    break;
                                case 3:
                                    L.print_books();
                                    break;
                                case 4:
                                    L.add_member();
                                    break;
                                case 5:
                                    L.remove_member();
                                    break;
                                case 6:
                                    L.print_members();
                                    break;
                                default:
                                    System.out.println("--- INVALID VALUE ---");
                                    break;
                            }
                        }
                    }
                    System.out.println("Librarian id and Librarian password are not correct.");
                    break;
                case 2:
                    System.out.print("Member username: ");
                    String username = input.next();
                    System.out.print("Member password: ");
                    String password2 = input.next();
                    Member tmp = L.top2;
                    if (tmp == null) {
                        System.out.println("--- EMPTY ---");
                        break;
                    } else {
                        while (tmp != null) {

                            if (tmp.username.equals(username) && tmp.password.equals(password2)) {
                                System.out.println("1)Display all books");
                                System.out.println("2)Take a book");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                            }
                            tmp = tmp.next;
                        }
                        System.out.println("There is no such username and password.");
                        break;
                    }
            }
        }
    }
}
