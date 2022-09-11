package player;

import jobClass.*;

public interface LevelUp {
    DefaultClass DF = new DefaultClass();

    static void levelUp(int exp){
        if(exp >= 40){
            DF.setLevel(DF.getLevel()+1);
            DF.setExp(0);
            DF.setDamage(DF.getDamage() + DF.getLevel()*10);
            DF.setHealth(DF.getHealth() + DF.getLevel()*20);
            DF.setSkillDamage(DF.getSkillDamage() + DF.getLevel()*10);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("$ ||      ||||||| ||      || ||||||| ||       ||     || |||||||| $");
            System.out.println("$ ||      ||       ||    ||  ||      ||       ||     || ||    || $");
            System.out.println("$ ||      |||||||   ||  ||   ||||||| ||       ||     || |||||||| $");
            System.out.println("$ ||      ||         ||||    ||      ||       ||     || ||       $");
            System.out.println("$ ||||||| |||||||     ||     ||||||| |||||||  ||||||||| ||       $");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            DF.printStatus();
        }
    }
}
