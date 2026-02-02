package main.java.com.kunal.dsa._00_Basics;

public class _01_ReverseNumber {
    public static void main (String[] args){
        int num = 123456 , rev = 0 ;
        while(num !=0){
            rev = rev * 10 + num % 10 ;
            num /= 10 ;
        }
        System.out.println("Reversed: " + rev);
    }
}
