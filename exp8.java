package mypackage;

import java.util.*;

public class exp8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number"); // optional
        int x = sc.nextInt();

        if(x % 2 ==0){
        System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
    
}
