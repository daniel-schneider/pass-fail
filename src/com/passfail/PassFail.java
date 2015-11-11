package com.passfail;
import java.util.Scanner;

/**
 * Created by Dan on 9/24/2015.
 */
public class PassFail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("What grade did you get on your test");
        a = in.nextInt();
        if (a < 75) {
            System.out.println("too bad you failed");
        }
        else{
                System.out.println("congrats! you passed!");
            }
        }
    }


