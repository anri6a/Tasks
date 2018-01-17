package EasyClasses;

import java.util.Scanner;

public class ArithmeticOperationsWithNumbers {
    public static void main(String[] args) {
        double sum;
        double multipl;
        double minimum;
        double maximum;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        double firstNumber=scanner.nextDouble();
        System.out.println("Enter second number");
        double secondNumber=scanner.nextDouble();
        sum=firstNumber+secondNumber;
        multipl=firstNumber*secondNumber;
        if (firstNumber>secondNumber) {
            maximum = firstNumber;
            minimum=secondNumber;
        }
        else{
            minimum = firstNumber;
            maximum=secondNumber;
        }
        System.out.print("MAXIMUM="+maximum+"\nMINIMUM="+minimum+"\nSUM="+sum+"\nMULTIPLICATION="+multipl);
    }
}
