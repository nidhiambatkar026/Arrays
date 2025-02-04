//Take a matrix as input from the user. Serach for a given number x and print the indices at which it occurs
import java.util.*;
public class findx {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        int numbers[][] = new int[rows][columns];

        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the value to be search: ");
        int x =sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                //compare with x
                if(numbers[i][j]==x){
                    System.out.println("x found at location("+ i +", " + j + ")");
                }
            }
        }
    }
}
