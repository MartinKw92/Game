


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

public class Main {

    private static Log log = LogFactory.getLog(Main.class);


    public static void main (String[] args){
        log.info("Testing Info Message.");
        if (log.isDebugEnabled()){
            log.debug("Testing Debug Message.");
        }

        Figure[] fTab = new Figure[]{
                new Druid("Panoramix"),
                new Druid("Asterix"),
                new Elf("Legolas"),
                new Elf("Janusz"),
                new Elf("Grażyna")
        };

        Tool[] tTab = new Tool[]{
                new Wheapon(100),
                new Wheapon(70),
                new Armor(30),
                new Wine(50)
        };

        for (int i = 0; i < fTab.length; i++){
            int r = (int) (Math.random()*tTab.length);
            fTab[i].addTool(tTab[r], 0);
        }

        for(Figure f: fTab){
            System.out.println(f);
        }
        Figure user;
        Scanner input = new Scanner(System.in);
        int u = input.nextInt();
        user = fTab[u];

        int k = input.nextInt();
        while ( k > 0 && user.isAlive()){
            int r = (int) (Math.random()*fTab.length);
            if(r!= u){
                Figure.fight(user, fTab[r]);
                k--;
            }

            //System.out.println("main");

        }
        if (user.isAlive()) {
            System.out.println("Winner!");
        }
        else{
            System.out.println("Looser :(");
        }

        System.out.println(user);


    }
}
