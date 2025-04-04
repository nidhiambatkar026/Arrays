package imp_Codes;
import java.io.*;

public class deletingelements {
    public static void main(String[] args) {
        int array[] = new int[100];
        array[0] = 2;
        array[1] = 4;
        array[2] = 6;
        array[3] = 8;
        array[4] = 10;
        int Size = 5;

        int PositiontoDelete = 2;
        for(int i= PositiontoDelete; i< Size-1; i++){
            array[i] = array[i+1];
        }
        Size--;

        //output
        for(int i=0; i<Size; i++){
            System.out.println(array[i]);
        }
    }
}
