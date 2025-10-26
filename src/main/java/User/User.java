package User;
// two functions are added
/*1= borrow
2= return book function added

 */

import java.util.HashMap;
import java.util.Map;

public class User {
    private int id;
    private int loan;
    private String Username;
    private String email;
    private boolean active;

    Map<String, Integer> suspiciousRecord = new HashMap<>(20);
    Map<String, String> userInfo = new HashMap<>(20);


    public User(){}
    public User(int id, int loan, String name, String email, boolean active) {
        this.id = id;
        this.loan = loan;
        this.Username = name;
        this.email = email;
        this.active = active;
        userInfo.put(name, email);
    }

    public void borrowBook(String name, String emails, int id) {
        this.email = emails;
        this.Username = name;
        this.id = id;
        suspiciousRecord.put(name, id);
        System.out.println("book borrowed:"+name);
    }

    public User returnBook(String name,int id) {
        for (Map.Entry<String, Integer> entry : suspiciousRecord.entrySet()) {
            if(entry.getValue()==id){
                System.out.println("Thanks fro your concern! Mr/Miss:"+name);
            }
            else
                System.out.println("Not found");
        }
        return null;
    }
    public


    int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLoan() {
        return loan;
    }

    public void setLoan(int loan) {
        this.loan = loan;
    }

    public String getName() {
        return email;
    }

    public void setName(String name) {
        this.Username = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", loan=" + loan +
//                ", Username='" + Username + '\'' +
//                ", email='" + email + '\'' +
//                ", active=" + active +
//                ", suspiciousRecord=" + suspiciousRecord +
//                ", userInfo=" + userInfo +
//                '}';
//    }


    public String toString() {
        return "User{" +
                ", suspiciousRecord=" + suspiciousRecord +
                ", userInfo=" + userInfo +
                '}';
    }
}
