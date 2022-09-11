package world;

import jobClass.DefaultClass;
import player.LevelUp;

import java.util.ArrayList;
import java.util.Random;

public class Monster implements LevelUp {
    private int monsterDamage;

    DefaultClass DF = new DefaultClass();
    private int monsterHealth;
    ArrayList<String> monsterList = new ArrayList<>();

    Random random = new Random();
    public String getRandomMonster(){
        monsterList.add("goblin");
        monsterList.add("bet");
        monsterList.add("rat");
        monsterList.add("dragon");
        monsterList.add("slime");

        String[] monsterList = {"goblin", "bet", "rat", "dragon", "slime"};

        return monsterList[random.nextInt(5)];
    }
    public ArrayList<String> getMonsterList() {
        return monsterList;
    }

    public int getMonsterDamage() {
        return monsterDamage;
    }

    public void setMonsterDamage(int monsterDamage) {
        this.monsterDamage = monsterDamage;
    }

    public int getMonsterHealth() {
        return monsterHealth;
    }

    public void setMonsterHealth(int monsterHealth) {
        this.monsterHealth = monsterHealth;
    }

    public void goblin(){
        setMonsterDamage(DF.getLevel()*10);
        setMonsterHealth(DF.getLevel()*30);
    }
    public void bet(){
        setMonsterDamage(DF.getLevel()*15);
        setMonsterHealth(DF.getLevel()*20);
    }
    public void rat(){
        setMonsterDamage(DF.getLevel()*15);
        setMonsterHealth(DF.getLevel()*25);
    }
    public void dragon(){
        setMonsterDamage(DF.getLevel()*30);
        setMonsterHealth(DF.getLevel()*50);
    }
    public void slime(){
        setMonsterDamage(DF.getLevel()*10);
        setMonsterHealth(DF.getLevel()*10);
    }
}
