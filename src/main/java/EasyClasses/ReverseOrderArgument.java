package EasyClasses;

import java.util.Scanner;

public class ReverseOrderArgument {
    public static void main(String[] args) {
        String inputString;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your arguments");
        inputString=scanner.nextLine();
        char [] inputStrCharArr=inputString.toCharArray();

        for (int i=inputStrCharArr.length-1; i>=0; i--){
            System.out.print(" "+inputStrCharArr[i]);
        }
    }
}
