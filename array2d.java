import java.util.*;
public class array2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columbs: ");
        int columbs = sc.nextInt();

        int numbers[][] = new int[rows][columbs];
        //input 
        //rows
        for(int i=0;i<rows;i++){
           //columbs
           for(int j=0;j<columbs;j++){
            numbers[i][j] = sc.nextInt();
           }
        }

        //output
        for(int i=0; i<rows; i++){
            for(int j=0;j<columbs;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
