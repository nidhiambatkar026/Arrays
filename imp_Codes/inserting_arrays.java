package imp_Codes;
import java.util.*;

class inserting_arrays {
    public static void main(String args[]){
        int array[] = new int[100];
        array[0] = 2;
        array[1] = 4;
        array[2] = 6;
        array[3] = 8;
        array[4] = 10;
        int Size = 5;

        int NewPosition = 2; //index where we need to insert new element
        int NewElement = 7;

        for(int i= Size-1; i >= NewPosition; i-- ){
            array[i+1] = array[i];
        }
        array[NewPosition] = NewElement;
        Size++;

        //print the updated array
        for(int i=0; i <Size; i++){
            System.out.println(array[i]+ " ");
        }
    }
}
