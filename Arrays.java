//Take an array of names as input from the user and print them on the screen.

import java.util.*;
public class Arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array: ");
      int size = sc.nextInt();
      String names[] = new String[size];


      //input
      System.out.println("Enter Names: ");
      for(int i=0; i<size; i++) {
          names[i] = sc.next();
      }
     
      //output
      System.out.println("Names are: ");
       for(int i=0; i<names.length; i++) {
           System.out.println("name " + (i+1) +" is : " + names[i]);
       }
      
   }
}
