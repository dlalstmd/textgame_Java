package jobClass;

import player.DieMassage;

import java.util.ArrayList;

public class WarriorClass extends DefaultClass implements DieMassage {
    public WarriorClass() {
        setExp(0);
        setHealth(100);
        setEnergy(60);
        setDamage(20);
        setSkillDamage(30);
        setPlayerClass("전사");
        setLevel(1);

    }

    @Override
    public void dieMessage(int day) {
        ArrayList<String> dieMessage = new ArrayList<>();
        dieMessage.add("난");
        dieMessage.add(" ");
        dieMessage.add("죽");
        dieMessage.add("음");
        dieMessage.add("을");
        dieMessage.add(" ");
        dieMessage.add("택");
        dieMessage.add("하");
        dieMessage.add("겠");
        dieMessage.add("다");
        dieMessage.add(".");
        dieMessage.add("\n");
        dieMessage.add("Y");
        dieMessage.add("O");
        dieMessage.add("U");
        dieMessage.add(" ");
        dieMessage.add("D");
        dieMessage.add("I");
        dieMessage.add("E");
        for (String s : dieMessage) {
            try {
                Thread.sleep(300);
                System.out.print(s);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\n");
        System.out.println("생존 일 수 : " + day + "일");
    }
}
