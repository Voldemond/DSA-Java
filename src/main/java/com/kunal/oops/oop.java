package main.java.com.kunal.oops;

import java.util.ArrayList;
import java.util.List;

public class oop {
    public static void main (String args[]){

            Student s = new Student();
            s.set_name("Student");
            Teacher t = new Teacher();
            s.set_name("Teacher");


        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(t);
        User.admins.add(new User("Kunal"));
        User.admins.add(new User("kumkum"));
        User.admins.add(new User("dear"));

        //User.print_admin_names();

        for (User u :User.admins){
            u.verify();
        }
            }
}
