package world;

import java.util.ArrayList;

public class Monster {
    private int monsterDamage;
    private int monsterHealth;
    ArrayList<String> monsterList = new ArrayList<>();
    public void setMonsterList(){
        monsterList.add("goblin");
        monsterList.add("bet");
        monsterList.add("rat");
        monsterList.add("dragon");
        monsterList.add("slime");
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
        setMonsterDamage(10);
        setMonsterHealth(30);
    }
    public void bet(){
        setMonsterDamage(15);
        setMonsterHealth(20);
    }
    public void rat(){
        setMonsterDamage(15);
        setMonsterHealth(25);
    }
    public void dragon(){
        setMonsterDamage(30);
        setMonsterHealth(50);
    }
    public void slime(){
        setMonsterDamage(10);
        setMonsterHealth(10);
    }
}
