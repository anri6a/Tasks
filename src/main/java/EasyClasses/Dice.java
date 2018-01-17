package EasyClasses;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        int dice;
        int sum=0;
        for (int i = 0; i <= 1; i++) {
            dice = random.nextInt(6) + 1;
            System.out.println(dice);
            sum+=dice;
        }
        System.out.println("Summa = "+sum);
    }
}
