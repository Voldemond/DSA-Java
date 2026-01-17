package main.java.com.kunal.oops;

import java.util.ArrayList;
import java.util.List;

public class oop {
    public static void main (String args[]){
        User.admins = new ArrayList<User>();
        User.admins.add(new User("Kunal"));
        User.admins.add(new User("kumkum"));
        User.admins.add(new User("dear"));

        User.print_admin_names();
            }
}
