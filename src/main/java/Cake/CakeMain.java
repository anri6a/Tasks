package Cake;

import org.apache.log4j.Logger;

public class CakeMain {
    private static Logger Log=null;
    public static void main(String[] args) {
CakeSurprise cakeSurprise=new CakeSurprise();
Log=Logger.getLogger("You got a cake with - "+cakeSurprise.surpriseSelection());
       // System.out.println("You got a cake with - "+cakeSurprise.surpriseSelection());
    }
}
