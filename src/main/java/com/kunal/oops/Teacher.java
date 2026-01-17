package main.java.com.kunal.oops;

public class Teacher extends User {
    void verify(){
        System.out.println("Verifying through Phone");
        set_verified(true);
    }
}
