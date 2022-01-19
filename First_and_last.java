//G kartheshwar (12014169)
package com.kartheshwar;

import java.util.Scanner;

public class First_and_last {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        int first=num%10;
        System.out.println("the first digit of the number is : "+first);
        int last;
        while(num>0) {

            last = num % 10;
            if(num<10) {
                System.out.println("the last digit of the num is : " + last);
            }
            num=num/10;
        }
    }
}
