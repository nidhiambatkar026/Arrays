//Take an array as input from the user. Serach for a given number x and print the index at which it occurs.

import java.util.Scanner;

public class search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int Size = sc.nextInt();
        int numbers[] = new int[Size];

        //input
        System.out.println("Enter the values: ");
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]== x){
                System.out.println(x+ " found at index " +i);
            }
        }
    }
}
