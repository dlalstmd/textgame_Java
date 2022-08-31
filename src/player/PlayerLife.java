package player;

import jobClass.*;
import world.*;

public class PlayerLife implements ActionChoice, Heal, PlayerInventory{
    public DefaultClass character;
    HuntingZone huntingZone = new HuntingZone();
    public PlayerLife(DefaultClass character) {
        this.character = character;
    }

    public DefaultClass Life(){
        int day = 0;
        int weaponPrintCount = 1;
        String action = ActionChoice.Action(day);

        while (!action.equals("자결")){

            if(character.getHealth() == 0){
                break;
            } else if (day == 0) {
                day += 1;
            }
            System.out.println("===========" + day + "일 차" + "===========");
            System.out.println();
            System.out.println("현재 위치 : " + character.getLocation());
            System.out.println();
            action = ActionChoice.Action(day);

            int portionCount = 0;

            switch (action) {
                default:
                    action = "잘못씀";
                    System.out.println("타이핑을 잘못하면 처음부터");
                    break;

                case "다음날":
                    day += 1;
                    break;

                case "회복":
                    while(action.equals("회복")){
                        if (portionCount >= 2){
                            System.out.println("회복 (2/2) 컷");
                            break;
                        }

                        character.setHealth(Heal.portion(character.getHealth()));

                        System.out.println("포션 사용! HP + 10");

                        portionCount += 1;

                        action = ActionChoice.Action(day);
                    }

                case "스텟출력":
                    character.printStatus();
                    action = ActionChoice.Action(day);

                    while (action.equals("스텟출력")) {
                        character.printStatus();
                        action = ActionChoice.Action(day);
                    }
                    break;

                case "상점":
                    PlayerInventory.weaponListPrint(weaponPrintCount);
                    weaponPrintCount += 1;
                    action = ActionChoice.Action(day);

                    while(action.equals("상점")){
                        PlayerInventory.weaponListPrint(weaponPrintCount);
                        action = ActionChoice.Action(day);
                    }
                    break;

                case "사냥터":
                    character.setHealth(huntingZone.moveToHuntingZone(character.getHealth()));
                    action = ActionChoice.Action(day);

                    while(action.equals("사냥터")){
                        if(character.getHealth() == 0) {
                            break;
                        }
                        character.setHealth(huntingZone.moveToHuntingZone(character.getHealth()));
                        action = ActionChoice.Action(day);
                    }
                    break;
            }
            if (action.equals("잘못씀")){
                continue;
            }

            else if(!action.equals("다음날")){
                day += 1;
            }
        }

        System.out.println("[    YOU DIE    ]");
        return character;
    }
}
