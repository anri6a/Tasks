package Cake;

import java.util.Random;

public class CakeSurprise {
    public String surpriseSelection() {
        String surprise=null;
        int numberOfSurprise;
        Random random=new Random();
        numberOfSurprise=random.nextInt(6)+1;
        switch (numberOfSurprise) {
            case 1:
                surprise = "milk";
                break;
            case 2:
                surprise = "chocolate";
                break;
            case 3:
                surprise = "fish";
                break;
            case 4:
                surprise = "jem";
                break;
            case 5:
                surprise = "juice";
                break;
            case 6:
                surprise = "nothing";
                break;
        }
        return surprise;
    }
}
