import java.util.Scanner;

public class inputarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int Size = sc.nextInt();
        int numbers[] = new int[Size];

        //input
        for(int i=0; i<Size; i++){
            System.out.print("Enter value: ");
            numbers[i]= sc.nextInt();
        }

        //output
        for(int i=0;i<Size;i++){
            System.out.println("Array list: "+numbers[i]);
        }
    }
}
