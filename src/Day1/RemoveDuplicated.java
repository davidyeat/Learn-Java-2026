package Day1;
/*
    Problem-2: Remove duplicated arrays
*/

import java.util.Arrays;

public class RemoveDuplicated {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 2, 3, 4, 5, 4};
        int size = array.length;

        Arrays.sort(array);

        int newSize = 0;

        for(int j = 1; j < size; j++){
            if(array[j] != array[newSize]){
                newSize++;
                array[newSize] = array[j];
            }
        }

        System.out.print("Array after removing duplicated: ");
        for(int k = 0; k <= newSize; k++){
            System.out.print(array[k] + " ");
        }
    }
}
