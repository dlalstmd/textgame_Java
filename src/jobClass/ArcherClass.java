package jobClass;

import player.DieMassage;

import java.util.ArrayList;

public class ArcherClass extends DefaultClass implements DieMassage {
    public ArcherClass() {
        setExp(0);
        setHealth(80);
        setEnergy(80);
        setDamage(25);
        setSkillDamage(30);
        setPlayerClass("궁수");
        setLevel(1);
        setMoney(10000);
    }

    @Override
    public void dieMessage(int day) {
        ArrayList<String> dieMassage = new ArrayList<>();
        dieMassage.add("Y");
        dieMassage.add("O");
        dieMassage.add("U");
        dieMassage.add(" ");
        dieMassage.add("D");
        dieMassage.add("I");
        dieMassage.add("E");
        for (String s : dieMassage) {
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
