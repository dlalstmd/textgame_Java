package player;

import jobClass.*;
import world.*;

public class PlayerLife {
    public DefaultClass character;
    public HuntingZone huntingZone;
    public PlayerLife(DefaultClass character) {
        this.character = character;
    }

    public DefaultClass Life(){
        int day = 1;

        while (character.getHealth() > 0){
            System.out.println("===========" + day + "일 차" + "===========");
            System.out.println();
            System.out.println("현재 위치 : " + character.getLocation());
            System.out.println();
            huntingZone.moveToHuntingZone();


            System.out.println(character.getHealth());


            character.setHealth(character.getHealth() - 10);
            System.out.println(character.getHealth());

            day += 1;
        }

        System.out.println("[    YOU DIE    ]");
        return character;
    }
}
