import jobClass.*;
import player.PlayerLife;

import java.util.Scanner;

public class Main {
    final static String WARRIOR = "전사";
    final static String MAGICIAN = "마법사";
    final static String ARCHER = "궁수";
    final static String ASSASSIN = "암살자";
    final static String GOD = "신";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("닉네임 설정 : ");
        String name = sc.next();

        System.out.print("클래스 설정 (전사, 마법사, 궁수, 암살자) : ");
        String classSet = sc.next();

        DefaultClass character = null;

        if(classSet.equals(GOD)){
            character = new God();
        }

        switch (classSet) {
            case WARRIOR:
                character = new WarriorClass();
                break;
            case MAGICIAN:
                character = new MagicianClass();
                break;
            case ARCHER:
                character = new ArcherClass();
                break;
            case ASSASSIN:
                character = new AssassinClass();
                break;
            default:
                break;
        }

        if (character != null) {
            character.setName(name);
            character.setClassSetting(classSet);
            character.printStatus();

            PlayerLife playerLife = new PlayerLife(character);
            character = playerLife.Life();
        }
    }
}
