package LibManage;
/*functions added are
1) add book
2) add user
3) show book
4) find book
"*/
import BookManagment.Book;
import User.User;

import java.util.ArrayList;
import java.util.List;

public class Lib {
    private List<Book> books= new ArrayList<>(20);
    private List<User> users = new ArrayList<>(20);

    public void addBook(Book book){
        books.add(book);
        System.out.println("added:"+book);
    }
    public void addUser(User user){
        users.add(user);
        System.out.println("Added:"+user);
    }
    public void showBook(){
        for (Book b: books){
            System.out.println("Book:"+b.toString());
        }
    }
    public Book findBook(String  title){
        for (Book b:books){
            if (b.getTitle().equalsIgnoreCase(title))return b;
        }
        return null;
    }
    public void totalUsers(){
        for (User user: users){
            System.out.println(user);
        }
    }
    public void totalBooks(){
        for (Book b: books){
            System.out.println(b);
        }
    }




}
