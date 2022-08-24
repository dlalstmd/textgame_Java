import jobClass.*;

import java.util.Scanner;

public class Main {
    final static String WARRIOR = "전사";
    final static String MAGICIAN = "마법사";
    final static String ARCHER = "궁수";
    final static String ASSASSIN = "암살자";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("닉네임 설정 : ");
        String name = sc.next();

        System.out.print("클래스 설정 (전사, 마법사, 궁수, 암살자) : ");
        String classSet = sc.next();

        DefaultClass character = null;
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
        }

        System.out.println(character != null ? character.getClassSetting() : null);
        System.out.println(character != null ? character.getName() : null);
        System.out.println("경험치 : " + (character != null ? character.getExp() : 0));
        System.out.println("체력 : " + (character != null ? character.getHealth() : 0));
        System.out.println("공격력 : " + (character != null ? character.getDamage() : 0));
        System.out.println("에너지 : " + (character != null ? character.getEnergy() : 0));
        System.out.println("스킬데미지 : " + (character != null ? character.getSkillDamage() : 0));

    }
}
