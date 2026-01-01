package Day1.Calculator;
import Day1.Calculator.Utils.Operation;
import java.util.Scanner;

public class Calculator {

    /*==================== Basic Operation Calculator ====================*/

    static void basicOperation(Scanner inputScanner){
        do{
            /*==================== Basic Calculator Menu ====================*/
            System.out.println("\n/*===== Welcome to Basic Calculator =====*/");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Percent");
            System.out.println("6. Square");
            System.out.println("7. Square Root");
            System.out.println("0. Back to Main Menu");
            System.out.println("/*=====================================*/\n");

            int choice;
            double num, num1, num2;

            /* User choose operation */
            System.out.print("Enter your choice: ");
            choice = inputScanner.nextInt();

            switch (choice){
                case 0:
                    System.out.println("Returning to Main Menu...");
                    return;
                case 1:
                    num1 = getInput(inputScanner, "Enter the first number: ");
                    num2 = getInput(inputScanner, "Enter the second number: ");
                    System.out.println("Result: " + Operation.addition(num1, num2));
                    break;
                case 2:
                    num1 = getInput(inputScanner, "Enter the first number: ");
                    num2 = getInput(inputScanner, "Enter the second number: ");
                    System.out.println("Result: " + Operation.subtraction(num1, num2));
                    break;
                case 3:
                    num1 = getInput(inputScanner, "Enter the first number: ");
                    num2 = getInput(inputScanner, "Enter the second number: ");
                    System.out.println("Result: " + Operation.multiplication(num1, num2));
                    break;
                case 4:
                    num1 = getInput(inputScanner, "Enter the first number: ");
                    num2 = getInput(inputScanner, "Enter the second number: ");
                    System.out.println("Result: " + Operation.division(num1, num2));
                    break;
                case 5:
                    num = getInput(inputScanner, "Enter the number: ");
                    System.out.println("Result: " + Operation.percent(num));
                    break;
                case 6:
                    num = getInput(inputScanner, "Enter the number: ");
                    System.out.println("Result: " + Operation.square(num));
                    break;
                case 7:
                    num = getInput(inputScanner, "Enter the number: ");
                    System.out.println("Result: " + Operation.squareRoot(num));
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }while (true);
    }

    /*==================== Advanced Operation Calculator ====================*/
    static void advancedOperation(Scanner inputScanner){
        do{
            /*==================== Advanced Calculator Menu ====================*/
            System.out.println("\n/*===== Welcome to Advanced Calculator =====*/");
            System.out.println("1. Power");
            System.out.println("2. Factorial");
            System.out.println("3. sin");
            System.out.println("4. cos");
            System.out.println("5. tan");
            System.out.println("6. log");
            System.out.println("7. ln");
            System.out.println("0. Back to Main Menu");
            System.out.println("/*==========================================*/\n");

            int choice;
            double num;

            /* User choose operation */
            System.out.print("Enter your choice: ");
            choice = inputScanner.nextInt();

            switch (choice){
                case 0:
                    System.out.println("Returning to Main Menu...");
                    return;
                case 1:
                    double base = getInput(inputScanner, "Enter base number: ");
                    double exp = getInput(inputScanner, "Enter exponent: ");
                    System.out.println("Result: " + Operation.power(base, exp));
                    break;
                case 2:
                    int n = (int)getInput(inputScanner, "Enter number: ");
                    System.out.println("Result: " + Operation.factorial(n));
                    break;
                case 3:
                    num = getInput(inputScanner, "Enter angle (degree): ");
                    System.out.println("Result: " + Operation.sin(num));
                    break;
                case 4:
                    num = getInput(inputScanner, "Enter angle (degree): ");
                    System.out.println("Result: " + Operation.cos(num));
                    break;
                case 5:
                    num = getInput(inputScanner, "Enter angle (degree): ");
                    System.out.println("Result: " + Operation.tan(num));
                    break;
                case 6:
                    num = getInput(inputScanner, "Enter number: ");
                    System.out.println("Result: " + Operation.log(num));
                    break;
                case 7:
                    num = getInput(inputScanner, "Enter number: ");
                    System.out.println("Result: " + Operation.ln(num));
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }

        }while (true);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("\n===== Mini Calculator Menu =====");
            System.out.println("1. Basic Operations");
            System.out.println("2. Advanced Operations");
            System.out.println("0. Exit");
            System.out.println("================================\n");

            int choice;
            System.out.print("Enter your option: "); choice = scanner.nextInt();

            switch (choice){
                case 0:
                    System.out.println("Exit...");
                    return;
                case 1:
                    basicOperation(scanner);
                    break;
                case 2:
                    advancedOperation(scanner);
                    break;
                default:
                    System.out.println("Wrong option! Let's try again.");
            }
        }while (true);
    }

    static double getInput(Scanner input, String message){
        System.out.print(message);
        return input.nextDouble();
    }
}
