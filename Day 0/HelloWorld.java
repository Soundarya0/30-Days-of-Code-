import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HelloWorld{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); // use the Scanner class to read from stdin
      String inputString = scan.nextLine(); // read a Line of input and save it to a variable
      scan.close(); // close the Scanner
      
      
      System.out.println("Hello, World.");   // Your first line of output goes here
  
      System.out.println(inputString);       // Write the second line of output
   }
}