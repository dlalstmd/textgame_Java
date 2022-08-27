package world;

import player.PlayerInformation;

import java.util.Random;
import java.util.Scanner;

public class HuntingZone extends PlayerInformation {
    Scanner sc = new Scanner(System.in);
    PlayerInformation playerLocation = new PlayerInformation();
    Monster monster = new Monster();
    Random random = new Random();

    public void location_set(){
        playerLocation.setLocation("HuntingZone");
    }

    public void moveToHuntingZone(){
        System.out.print("사냥터로 이동하시겠습니까? (Yes, No) : ");
        String answer = sc.next();
        if (answer.equals("Yes")){
            location_set();
            System.out.println("HuntingZone으로 이동했습니다.");
            monster.setMonsterList();

        }
    }
}
