package EasyClasses;

import java.util.Scanner;

public class QuadricEquation {
    public static void main(String[] args) {
        double discriminant;
        int DISCRIMINANT_COEF = 4;
        int QUADRIC_EXPONENT = 2;
        double firstRoot;
        double secondRoot;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficient a");
        double a = scanner.nextInt();
        System.out.println("Enter coefficient b");
        double b = scanner.nextInt();
        System.out.println("Enter coefficient c");
        double c = scanner.nextInt();
        discriminant = Math.pow(b, QUADRIC_EXPONENT) - DISCRIMINANT_COEF * a * c;
        if (discriminant < 0) {
            System.out.println("There are no real solutions, try again");
        } else {
            firstRoot = (-b + Math.sqrt(discriminant)) / (QUADRIC_EXPONENT * a);
            secondRoot = (-b - Math.sqrt(discriminant)) / (QUADRIC_EXPONENT * a);
            System.out.println("Roots are:" + firstRoot + "and" + secondRoot);
        }
    }
}
