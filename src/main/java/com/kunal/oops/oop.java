package main.java.com.kunal.oops;

import java.util.ArrayList;
import java.util.List;

public class oop {
    public static void main (String args[]){
        /* System.out.println("hello");
        User u = new User("Caleb","Silver");
        User u2 = new User("kunal","Silver");
        System.out.println(u.equals(u2)); */

            //    User u = new User();
               // u.set_name("Kunal");
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Kunal"));
        users.add(new User("kumkum"));
        users.add(new User("dear"));

        for(int i=0;i< users.size();i++){
            System.out.println(users.get(i).get_name());
        }
       // System.out.println(users.get(0).get_name());

        for(User u : users){
            System.out.println(u.get_name());
        }
            }
}
