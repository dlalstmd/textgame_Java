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
        choiceJob(classSet, name);

        PlayerInformation pI;

        switch (classSet) {
            case WARRIOR:
                pI = new WarriorClass();
                pI.setName(name);
                pI.setClassSetting(classSet);

                System.out.println(pI.getClassSetting() + " " + pI.getName() + " 생성 완료!");
                break;
            case MAGICIAN:
                pI = new MagicianClass();
                pI.setName(name);
                pI.setClassSetting(classSet);

                System.out.println(pI.getClassSetting() + " " + pI.getName() + " 생성 완료!");
                break;
            case ARCHER:
                pI = new ArcherClass();
                pI.setName(name);
                pI.setClassSetting(classSet);

                System.out.println(pI.getClassSetting() + " " + pI.getName() + " 생성 완료!");
                break;
            case ASSASSIN:
                pI = new AssassinClass();
                pI.setName(name);
                pI.setClassSetting(classSet);

                System.out.println(pI.getClassSetting() + " " + pI.getName() + " 생성 완료!");
                break;
        }
    }
    public static void choiceJob(String classSet, String name){
        PlayerInformation pI = new PlayerInformation();

        switch (classSet) {
            case WARRIOR:

                break;
            case MAGICIAN:

                break;
            case ARCHER:

                break;
            case ASSASSIN:

                break;
        }
    }
}
