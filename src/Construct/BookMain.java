package Construct;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("안녕, 자바", "세호");
        book2.displayInfo();
//
        Book book3 = new Book("안녕, 자바", "세호", 19);
        book3.displayInfo();
    }
}
