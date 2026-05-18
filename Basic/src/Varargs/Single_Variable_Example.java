package Varargs;

import java.io.*;

public class Single_Variable_Example {
	// Method that accepts variable number of String arguments using varargs
    public static void Names(String... n) {
      
        // Iterate through the array and print each name
        for (String i : n) {
            System.out.print(i + " "); 
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
      
        // Calling the 'Names' method with different number of arguments
        Names("geek1", "geek2");           
        Names("geek1", "geek2", "geek3");   
    }
}
