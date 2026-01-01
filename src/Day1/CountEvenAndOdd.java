package Day1;

import java.util.ArrayList;

public class CountEvenAndOdd {
    public static void main(String[] args){
        int[] numbers = {1, 3, 2, 5, 4, 6, 7, 8, 9};

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                even.add(number);
            }
            if(number % 2 != 0){
                odd.add(number);
            }
        }
        System.out.print("Original Array: ");
        for(int i : numbers){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Even Array: ");
        for(int j : even){
            System.out.print(j + " ");
        }

        System.out.println();

        System.out.print("Odd Array: ");
        for(int k : odd){
            System.out.print(k + " ");
        }
    }
}
