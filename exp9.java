package mypackage;

import java.util.*;

public class exp9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num a");
        int a = sc.nextInt();

        System.out.println("enter num b");
        int b = sc.nextInt();

         if(a == b) {
            System.out.println("equal");
        }else{
            if(a > b) {
                System.out.println("a is greater");
            }else{
                System.out.println("a is leaaer");
            }
        }


    }
}
