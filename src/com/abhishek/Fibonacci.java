package com.abhishek;
import java.util.Scanner;
public class Fibonacci {
    int input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N");
        return sc.nextInt();
    }
    void calculate(int a, int b, int num){
        int sum = 0;
        System.out.print(a+", "+b+", ");
        for(int i=1;i<=num;i++)
        {
            sum = a + b;
            System.out.print(sum+", ");
            a = b;
            b = sum;
        }
    }
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        int a = 0, b = 1;
        int num = obj.input();
        obj.calculate(a,b,num);

    }
}
