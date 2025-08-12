package com.abhishek;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Long Integer");
        long num = sc.nextLong();
        long display = num;
        long reverse = 0 ;
        while(num!=0)
        {
            reverse = (num%10) + (reverse*10);
            num /= 10;
        }
        System.out.println("Number Entered: "+display+" Reversed: "+reverse);

    }
}
