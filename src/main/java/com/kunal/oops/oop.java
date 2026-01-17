package main.java.com.kunal.oops;

import java.util.ArrayList;
import java.util.List;

public class oop {
    public static void main (String args[]){

            Student s = new Student();
        System.out.println(s.get_verified());
        s.set_membership("Gold");
        System.out.println(s.get_membership());
        /*
        User.admins = new ArrayList<User>();
        User.admins.add(new User("Kunal"));
        User.admins.add(new User("kumkum"));
        User.admins.add(new User("dear"));

        User.print_admin_names();*/


            }
}
