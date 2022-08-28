package player;

import jobClass.*;
import world.*;

import java.io.PrintStream;

public class PlayerLife implements ActionChoice, Market{
    public DefaultClass character;
    HuntingZone huntingZone = new HuntingZone();
    public PlayerLife(DefaultClass character) {
        this.character = character;
    }

    public DefaultClass Life(){
        int day = 1;
        String choice = null;
        while (character.getHealth() > 0){
            System.out.println("===========" + day + "일 차" + "===========");
            System.out.println();
            System.out.println("현재 위치 : " + character.getLocation());
            System.out.println();
            String action = ActionChoice.Action();

            int portionCount = 0;

            while(!action.equals("사냥터")){
                if (portionCount >= 2){
                    System.out.println("상점 너무 많이가네 컷");
                    break;
                }

                character.setHealth(Market.portion(character.getHealth()));

                System.out.println("포션 사용! HP + 10");

                portionCount += 1;

                action = ActionChoice.Action();
            }

            character.setHealth(huntingZone.moveToHuntingZone(character.getHealth()));

            character.printStatus();

            day += 1;
        }

        System.out.println("[    YOU DIE    ]");
        return character;
    }
}
