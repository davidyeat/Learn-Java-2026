package Day1.Calculator.Utils;

public class Operation {
    /*=============== Basic calculator methods ===============*/
    // Addition Method
    public static double addition(double num1, double num2){
        return num1 + num2;
    }

    // Subtraction Method
    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    // Multiplication Method
    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    // Division Method
    public static double division(double num1, double num2){
        if(num2 == 0){
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return num1 / num2;
    }

    // Percent Method
    public static double percent(double num){
        return num / 100;
    }

    // Square Method
    public static double square(double num){
        return num * num;
    }

    // Square Root Method
    public static double squareRoot(double num){
        if(num < 0){
            System.out.println("Error: Cannot calculate square root of negative number!");
            return 0;
        }
        return Math.sqrt(num);
    }

    /*=============== Advanced calculator methods ===============*/
    // Power Method
    public static double power(double num, double exponent){
        return Math.pow(num, exponent);
    }

    // Factorial Method
    public static double factorial(int num){
        if(num < 0){
            System.out.println("Error: Factorial is not defined for negative numbers!");
            return 0;
        }
        if(num > 1){
            return num * factorial(num - 1);
        }else {
            return 1;
        }
    }

    // Sine Method
    public static double sin(double degree){
        return Math.sin(Math.toRadians(degree));
    }

    // Cosine Method
    public static double cos(double degree){
        return Math.cos(Math.toRadians(degree));
    }

    // Tangent Method
    public static double tan(double degree){
        return Math.tan(Math.toRadians(degree));
    }

    // Log Method
    public static double log(double num){
        return Math.log10(num);
    }

    // Ln Method
    public static double ln(double num){
        return Math.log(num);
    }
}
