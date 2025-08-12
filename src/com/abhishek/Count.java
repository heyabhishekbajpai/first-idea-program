package com.abhishek;
import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Long Integer");
        long num = sc.nextLong();
        long display = num;
        System.out.println("Enter the Digit to find");
        int digit = sc.nextInt();
        int temp;
        int flag = 0;
        while(num!=0)
        {
            if((num %10) == digit )
                flag++;
            num /= 10;
        }
        System.out.println("No of Times "+digit+" occurred in "+display+" is "+flag);

    }
}
