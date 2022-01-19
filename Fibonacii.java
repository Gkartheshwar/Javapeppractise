//G kartheshwar (12014169)
package com.kartheshwar;

import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            int a=0,b=1,c=0;
            while(c<=num){
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }
    }
    }

