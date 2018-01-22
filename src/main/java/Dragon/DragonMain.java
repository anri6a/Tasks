package Dragon;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class DragonMain {
    private static Logger logger=Logger.getLogger(DragonMain.class);

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How old is Dragon?");
        int dragonYearsOld=scanner.nextInt();

        DragonLogic dragonLogic=new DragonLogic();
        //dragonLogic.countDragonHeads(dragonYearsOld);

        logger.info(dragonLogic.countDragonHeads(dragonYearsOld)+"or more!!!");

    }
}
