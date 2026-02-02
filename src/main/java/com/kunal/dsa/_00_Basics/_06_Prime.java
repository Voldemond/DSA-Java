package main.java.com.kunal.dsa._00_Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _06_Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isprime = true ;
        if(num <=1){
            isprime = false ;
        }
        else {
            for(int i = 2 ; i <= num/2 ; i++){
                if(num % i == 0 ){
                    isprime = false ;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println(num + " is prime ");
        }else {
            System.out.println(num + " not prime ");
        }
    }
}
