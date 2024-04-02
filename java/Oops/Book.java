import java.sql.SQLOutput;

public class Book {
    static int totalNoOfBook;
    String title;
    String author ;
     String isbn;
     boolean isBorrowedBook;
     static {
         totalNoOfBook = 0;
     }
     {
         totalNoOfBook++;
    }
     Book(String isbn, String author,String title){

         this.isbn = isbn;
         this.author = author;
         this.title = title;
     }
     Book(String isbn){
         this(isbn,  "unknown","unknown");

     }

     void borrowedBook(){

         if(isBorrowedBook){
             System.out.println("Book is already borrowed ");
         }else{
             this.isBorrowedBook = true;
             System.out.println("Enjoy the Book");
         }
     }
     void returnBook(){
         if(isBorrowedBook){
             this.isBorrowedBook = false;
             System.out.println("Hope you enjoy the book");
         }else{
             System.out.println("the book is already in libary");
         }
     }
     void author(){
         System.out.println("Author: " +author);
     }
     void title(){
         System.out.println("Title: " +title );
     }

    public static void main(String[] args) {
        Book mybook = new Book("06","Ishowspeed","how to play Fifa");
        System.out.println(Book.totalNoOfBook);
        Book mybook2 = new Book("07","Prasant Sir","lets learn JAVA");

       mybook.title();
        mybook.author();

       mybook2.title();
        mybook2.author();

        mybook2.borrowedBook();
    }
}
