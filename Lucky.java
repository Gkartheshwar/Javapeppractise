//G kartheshwar (12014169)
package com.kartheshwar;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("enter the lucky num between 0 to 100");
        int no=0;
        while(no<=5){
            int luck= sc.nextInt();
            if(luck>num){
                System.out.println("the num is too large,please try again");
            }else if(luck<num){
                System.out.println("the num is too small,please try again");
            }else{
                System.out.println("congratz found the lucky num ");
                //System.exit(0);
            }
            no++;
        }


        /*int ans=sc.nextInt();
        switch(ans){
            case 1: if(ans==num/2 || ans>num/2){
                System.out.println("the num is small");
            }
            case 2:if(ans==num/2 || ans<num/2 && ans<)
        }
            */
    }
}
