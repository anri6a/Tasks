package Dragon;

public class DragonLogic {

    public int countDragonHeads(int yearsOld) {
        int heads;
        int COEFBEFORE = 3;
        int COEFAFTER = 2;
        if ((yearsOld > 0) && (yearsOld <= 100)) {
            heads = yearsOld * COEFBEFORE;
        } else {
            heads = yearsOld * COEFAFTER;
        }
        return heads;
    }

}
