
public class Book {
    int id;
    String title;
    String author;
    int year;
    boolean valid;
            
    Book next;
    
    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    
    public void displayInfo(){
        System.out.println("Book Information:");
        System.out.println("id: " + id);
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("year: " + year);
    }
}
