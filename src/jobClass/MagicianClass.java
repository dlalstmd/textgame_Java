package jobClass;

import player.DieMassage;

import java.util.ArrayList;

public class MagicianClass extends DefaultClass implements DieMassage {
    public MagicianClass() {
        setExp(0);
        setHealth(80);
        setEnergy(100);
        setDamage(10);
        setSkillDamage(50);
        setPlayerClass("마법사");
        setLevel(1);
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
