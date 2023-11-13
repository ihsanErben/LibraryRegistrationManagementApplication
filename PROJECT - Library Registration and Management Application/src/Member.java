
public class Member {
    String identity_number;
    String username;
    String password;

    Member next;
    
    public Member(String identity_number, String username, String password) {
        this.identity_number = identity_number;
        this.username = username;
        this.password = password;
    }
    
    public void print_member(){
        System.out.println("Identity Number: " + identity_number);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);   
    }
}
