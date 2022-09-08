package player;

import jobClass.*;
import world.*;

public class PlayerLife implements ActionChoice, Heal, PlayerInventory{
    DefaultClass character;
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
            String location = character.getLocation();
            System.out.println("===========" + day + "일 차" + "===========");
            System.out.println();
            System.out.println("현재 위치 : " + location);
            System.out.println();

            int portionCount = 0;

            label:
            while(true){
                action = ActionChoice.Action(day);
                switch (action) {
                    case "다음날":
                        day += 1;
                        break label;
                    case "자결":
                        break label;
                    case "회복":
                        if (portionCount < 2) {
                            character.setHealth(Heal.portion(character.getHealth()));

                            System.out.println("포션 사용! HP + 10");
                            portionCount += 1;
                        } else {
                            System.out.println("포션 부작용으로 낮잠 자버림");
                            break label;
                        }
                        break;
                    case "스텟출력":
                        character.printStatus();
                        PlayerInventory.getInventory();
                        break;
                    case "상점":
                        PlayerInventory.weaponListPrint(weaponPrintCount);
                        weaponPrintCount += 1;
                        System.out.print("무기를 구입하시겠습니까? (예, 아니오) : ");

                        if((character.getMoney() - 10000) < 0){
                            System.out.println("돈이 모자르다..");
                            break label;
                        }

                        int weaponBuy;
                        weaponBuy = ActionChoice.weaponBuy(character.getMoney());
                        if(weaponBuy == 0){
                            break;
                        } else{
                            PlayerInventory.buyWeapon(weaponBuy);
                        }
                        break;
                    case "사냥터":
                        character.setHealth(huntingZone.moveToHuntingZone(character.getHealth()));
                        character.setExp(character.getExp()+10);
                        character.setMoney(character.getMoney()+1000);
                        break;
                    default:
                        action = "잘못씀";
                        System.out.println("타이핑을 잘못하면 처음부터");
                        break label;
                }
            }
        }

        DieMassage.dieMassage(day);
        
        return character;
    }
}
