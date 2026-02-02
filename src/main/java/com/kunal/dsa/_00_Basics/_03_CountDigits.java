package main.java.com.kunal.dsa._00_Basics;

public class _03_CountDigits {
    public static void main (String []args){
        int num = 123456 , count = 0 ;
        while (num !=0 ){
            count++;
            num /= 10;
        }
        System.out.println("Digits : "+ count);
    }
}
