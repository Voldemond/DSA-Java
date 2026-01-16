package main.java.com.kunal.oops;

public class oop {
    public static void main (String args[]){
        System.out.println("hello");

        User u = new User("Caleb","Silver");
        User u2 = new User();

        System.out.println(u2.get_name());
        System.out.println(u2.get_membership());


    }
}
