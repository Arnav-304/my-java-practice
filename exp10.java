package mypackage;

import java.util.Scanner;
import java.util.io;

public class exp10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter===");
        int button = sc.nextInt();
        
        //here you can also use if else statement
        switch (button) {
            case 1 : System.out.println("hello");
                
                break;
            case 2 : System.out.println("nameste");
            break;
            
            case 3 : System.out.println("kaise ho");
            break;
                
        
            default : System.out.println("haaaaaaat");
                
        }
        
    }
    
}
