
import java.util.Scanner;

public class Library {

    Book top;
    Member top2;
    Scanner input = new Scanner(System.in);

    public void add_book() {
        System.out.print("id: ");
        int id = input.nextInt();
        System.out.print("title: ");
        String title = input.next();
        System.out.print("author: ");
        String author = input.next();
        System.out.print("year: ");
        int year = input.nextInt();
        Book newBook = new Book(id, title, author, year);
        if (top == null) {
            top = newBook;
        } else {
            newBook.next = top;
            top = newBook;
        }
    }

    public void remove_book() {
        if (top == null) {
            System.out.println("--- EMPTY ---");
        } else if (top.next == null) {
            top = null;
        } else {
            top = top.next;
        }
    }

    public void print_books() {
        System.out.println("-----------------------------");
        if (top == null) {
            System.out.println("--- EMPTY ---");
        } else {
            Book tmp = top;
            while (tmp != null) {
                tmp.displayInfo();
                tmp = tmp.next;
                System.out.println("-----------------------------");
            }
        }
    }

    public void add_member() {
        System.out.print("identity number: ");
        String identityNumber = input.next();
        System.out.print("username: ");
        String username = input.next();
        System.out.print("password: ");
        String password = input.next();
        Member newMember = new Member(identityNumber, username, password);
        if (top2 == null) {
            top2 = newMember;
        } else {
            newMember.next = top2;
            top2 = newMember;
        }
    }

    public void remove_member() {
        if (top2 == null) {
            System.out.println("--- EMPTY ---");
        } else if (top2.next == null) {
            top2 = null;
        } else {
            top2 = top2.next;
        }
    }

    public void print_members() {
        if (top2 == null) {
            System.out.println("--- EMPTY ---");
        } else {
            Member tmp = top2;
            while (tmp != null) {
                tmp.print_member();
                tmp = tmp.next;
                System.out.println("-----------------------------");
            }
        }
    }

}
