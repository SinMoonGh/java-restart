package Construct;

public class Book {
    String title;
    String author;
    int page;

    Book(){

    }

    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.page = 13;
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    // Todo: 코드를 작성하세요.
    void displayInfo(){
        System.out.println(this.title + ", " + this.author + ", " + this.page);
    }

}
