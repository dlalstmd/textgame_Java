package player;

import jobClass.*;

public class PlayerLife {
    public DefaultClass character;
    public PlayerLife(DefaultClass character) {
        this.character = character;
    }

    public DefaultClass Life(){
        int day = 1;
        int health = character.getHealth();
        System.out.println(health);

        while (health > 0){
            System.out.println("===========" + day + "일 차" + "===========");
            System.out.println();
            System.out.println("현재 위치 : " + character.getLocation());
            System.out.println();
            System.out.println(health);

            health -= 10;
            character.setHealth(health);
            System.out.println(character.getHealth());

            day += 1;
        }

        System.out.println("[    YOU DIE    ]");
        return character;
    }
}
