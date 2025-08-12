package com.abhishek;

import java.util.*;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char num = sc.next().charAt(0);
        int n = (int)num;
        //int n = sc.nextInt();
        //boolean n = sc.nextBoolean();
        System.out.println(num);
        System.out.println(n);
    }
}
