package player;

import jobClass.*;
import world.*;

public class PlayerLife {
    public DefaultClass character;
    HuntingZone huntingZone = new HuntingZone();
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
            int HP = character.getHealth();
            int Damage = huntingZone.moveToHuntingZone(HP);

            character.setHealth(Damage);

            character.printStatus();

            day += 1;
        }

        System.out.println("[    YOU DIE    ]");
        return character;
    }
}
