package main.java.com.kunal.dsa._00_Basics;

public class _04_SumDigits {
    public static void main(String []args){
        int nums = 12345 , sum =0 ;
        while (nums !=0 ){
            sum = sum  + nums % 10 ;
            nums /= 10 ;

        }
        System.out.println("Sum : "+ sum);
    }
}
