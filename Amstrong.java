//G kartheshwar (12014169)
package com.kartheshwar;

import java.util.Scanner;


public class Amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();


            int temp, amstrong = 0;
            int original = num;
            while (num > 0) {
                temp = num% 10;
                temp = temp * temp * temp;
                amstrong = amstrong + temp;
                num= num / 10;
            }
            if (amstrong == original) {
                System.out.println("the no is amstrong num");
            } else {
                System.out.println("the num is not amstrong num");
            }
        }
    }

