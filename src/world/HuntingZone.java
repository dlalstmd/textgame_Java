package world;

import jobClass.DefaultClass;
import player.PlayerInformation;

import java.util.Scanner;

public class HuntingZone extends DefaultClass{

    Scanner sc = new Scanner(System.in);
    PlayerInformation playerInformation = new PlayerInformation();
    Monster monster = new Monster();

    public void location_set(){
        playerInformation.getLocation();
    }

    public int moveToHuntingZone(int HP) {
        System.out.print("사냥터로 이동하시겠습니까? (네, 아니오) : ");
        String answer = sc.next();

        int Damage = 0;
        String choice = null;

        if (answer.equals("네")) {
            location_set();
            System.out.println("HuntingZone으로 이동했습니다.");

            String getMonster = monster.getRandomMonster();

            switch (getMonster) {
                case "goblin":

                    monster.goblin();
                    System.out.println("야생의 고블린을 만났다.");

                    while(monster.getMonsterHealth() > 0){
                        System.out.println("내 체력 : " + HP + " 고블린 체력 : " + monster.getMonsterHealth());
                        System.out.println("내 공격력 : " + getDamage() + " 고블린 공격력 : " + monster.getMonsterDamage());
                        System.out.print("선택지를 정하세요 (공격, 런) : ");
                        choice = sc.next();
                        if (choice.equals("공격")){
                            monster.setMonsterHealth(monster.getMonsterHealth() - getDamage());
                            Damage = HealthCalculate.healthCount(HP, monster.getMonsterDamage());
                            System.out.println();
                            System.out.println("   [   ]   /             ");
                            System.out.println("    /|\\   /              ");
                            System.out.println("   / | \\ /      고블린        ");
                            System.out.println("     |  /                ");
                            System.out.println("    / \\                  ");
                            System.out.println("   /   \\                 ");
                        }
                    }
                    System.out.println("고블린 처치!!");
                    break;
                case "bet":
                    monster.bet();
                    System.out.println("야생의 박쥐을 만났다.");
                    while(monster.getMonsterHealth() > 0){
                        System.out.println("내 체력 : " + HP + " 박쥐 체력 : " + monster.getMonsterHealth());
                        System.out.println("내 공격력 : " + getDamage() + " 박쥐 공격력 : " + monster.getMonsterDamage());
                        System.out.print("선택지를 정하세요 (공격, 런) : ");
                        choice = sc.next();
                        if (choice.equals("공격")){
                            monster.setMonsterHealth(monster.getMonsterHealth() - getDamage());
                            Damage = HealthCalculate.healthCount(HP, monster.getMonsterDamage());
                            System.out.println();
                            System.out.println("   [   ]   /             ");
                            System.out.println("    /|\\   /              ");
                            System.out.println("   / | \\ /      박쥐        ");
                            System.out.println("     |  /                ");
                            System.out.println("    / \\                  ");
                            System.out.println("   /   \\                 ");
                        }
                    }
                    System.out.println("박쥐 처치!!");

                    break;
                case "rat":
                    monster.rat();
                    System.out.println("야생의 쥐을 만났다.");
                    while(monster.getMonsterHealth() > 0){
                        System.out.println("내 체력 : " + HP + " 쥐 체력 : " + monster.getMonsterHealth());
                        System.out.println("내 공격력 : " + getDamage() + " 쥐 공격력 : " + monster.getMonsterDamage());
                        System.out.print("선택지를 정하세요 (공격, 런) : ");
                        choice = sc.next();
                        if (choice.equals("공격")){
                            monster.setMonsterHealth(monster.getMonsterHealth() - getDamage());
                            Damage = HealthCalculate.healthCount(HP, monster.getMonsterDamage());
                            System.out.println();
                            System.out.println("   [   ]   /             ");
                            System.out.println("    /|\\   /              ");
                            System.out.println("   / | \\ /      쥐        ");
                            System.out.println("     |  /                ");
                            System.out.println("    / \\                  ");
                            System.out.println("   /   \\                 ");
                        }
                    }
                    System.out.println("쥐 처치!!");
                    break;
                case "dragon":
                    monster.dragon();
                    System.out.println("야생의 드래곤을 만났다.");
                    while(monster.getMonsterHealth() > 0){
                        System.out.println("내 체력 : " + HP + " 드래곤 체력 : " + monster.getMonsterHealth());
                        System.out.println("내 공격력 : " + getDamage() + " 드래곤 공격력 : " + monster.getMonsterDamage());
                        System.out.print("선택지를 정하세요 (공격, 런) : ");
                        choice = sc.next();
                        if (choice.equals("공격")){
                            monster.setMonsterHealth(monster.getMonsterHealth() - getDamage());
                            Damage = HealthCalculate.healthCount(HP, monster.getMonsterDamage());
                            System.out.println();
                            System.out.println("   [   ]   /             ");
                            System.out.println("    /|\\   /              ");
                            System.out.println("   / | \\ /      드래곤        ");
                            System.out.println("     |  /                ");
                            System.out.println("    / \\                  ");
                            System.out.println("   /   \\                 ");
                        }
                    }
                    System.out.println("드래곤 처치!");

                    break;
                case "slime":
                    monster.slime();
                    System.out.println("야생의 슬라임을 만났다.");
                    while(monster.getMonsterHealth() > 0){
                        System.out.println("내 체력 : " + HP + " 슬라임 체력 : " + monster.getMonsterHealth());
                        System.out.println("내 공격력 : " + getDamage() + " 슬라임 공격력 : " + monster.getMonsterDamage());
                        System.out.print("선택지를 정하세요 (공격, 런) : ");
                        choice = sc.next();
                        if (choice.equals("공격")){
                            monster.setMonsterHealth(monster.getMonsterHealth() - getDamage());
                            Damage = HealthCalculate.healthCount(HP, monster.getMonsterDamage());
                            System.out.println();
                            System.out.println("   [   ]   /             ");
                            System.out.println("    /|\\   /              ");
                            System.out.println("   / | \\ /      슬라임        ");
                            System.out.println("     |  /                ");
                            System.out.println("    / \\                  ");
                            System.out.println("   /   \\                 ");
                        }
                    }

                    System.out.println("슬라임 처치!");
                    break;
            }
        } else if (answer.equals("아니오")) {
            return HP;
        }

        if (Damage == 0){
            return HP;
        } else {
            return Damage;
        }
    }
}
