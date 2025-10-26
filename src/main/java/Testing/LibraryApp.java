package Testing;

import BookManagment.Book;
import LibManage.Lib;
import User.User;

public class LibraryApp {
    public static void main(String[] args) {
       Lib lib = new Lib();
       User user= new User();

        Book book1= new Book(1111,"Javabook1","JavaPerson1",10,10);
        Book book2= new Book(1010,"Javabook2","JavaPerson2",15,15);

        Book book3= new Book(1110,"Javabook12","JavaPerson1",10,10);
        Book book4= new Book(999,"Javabook21","JavaPerson2",15,15);


        System.out.println("------------book added----------");
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);

        System.out.println("------------uses added-------------");
        User u1 = new User(10,1,"John","Jhone@email.com",true);
        lib.addUser(u1);
        User u2 = new User(123,1,"apple","apple@email.com",true);
        lib.addUser(u2);
        User u3 = new User(111,1,"monkey","monkey@email.com",true);
        lib.addUser(u3);

        System.out.println("**Borrow book**");
        u1.borrowBook("John","Jhone@email.com", 10);
        u2.borrowBook("appl","apple@gmail.com",123);
        u3.borrowBook("monkey","monkey@gmail.com",111);

        System.out.println("**books returned**");
        u1.returnBook("John ",10);
        u3.returnBook("monkey",111);

        System.out.println(" ------------------------total usesrs--------------------------------");
        lib.totalUsers();
        System.out.println(" -------------------------total books----------------------------------");
        lib.totalBooks();


    }

}
