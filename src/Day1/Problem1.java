package Day1;
/*
    Problem-1: Find the youngest person
*/

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        int dayP1, monthP1, yearP1;
        int  dayP2, monthP2, yearP2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first person date of birth: ");
        System.out.print("Day: "); dayP1 = scanner.nextInt();
        System.out.print("Month: "); monthP1 = scanner.nextInt();
        System.out.print("Year: "); yearP1 = scanner.nextInt();

        System.out.print("\n--------------------\n");

        System.out.println("Enter the seconde person date of birth: ");
        System.out.print("Day: "); dayP2 = scanner.nextInt();
        System.out.print("Month: "); monthP2 = scanner.nextInt();
        System.out.print("Year: "); yearP2 = scanner.nextInt();

        if(yearP1 > yearP2){
            System.out.println("The first person is the youngest!");
        }
        else if(yearP1 < yearP2){
            System.out.println("The second person is the youngest!");
        }
        else if(monthP1 > monthP2){
            System.out.println("The first person is the youngest!");
        }
        else if(monthP1 < monthP2){
            System.out.println("The second person is the youngest!");
        }
        else if(dayP1 > dayP2){
            System.out.println("The first person is the youngest!");
        }
        else if(dayP1 < dayP2){
            System.out.println("The second person is the youngest!");
        }
        else {
            System.out.println("Both people are the same age!");
        }
        scanner.close();
    }
}