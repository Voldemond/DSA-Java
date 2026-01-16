package main.java.com.kunal.oops;

public class oop {
    public static void main (String args[]){
        System.out.println("hello");

        User u = new User("Caleb","Silver");
        //User u2 = u ;
        User u2 = new User("kunal","Silver");

        System.out.println(u.equals(u2));
        //System.out.println(u2);


    }
}
