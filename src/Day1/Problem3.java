package Day1;
/*
    Problem-3: Reverse arrays
*/

public class Problem3 {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        int left = 0;
        int right = array.length - 1;

        while (left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        System.out.print("Array after reversing: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
