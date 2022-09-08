package jobClass;

import player.*;

public class DefaultClass extends PlayerInformation {
    private static int exp;
    private static int health;
    private static int energy;
    private static int damage;
    private static int skillDamage;
    private static String playerClass;
    private static int level;

    private static int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        DefaultClass.money = money;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        DefaultClass.level = level;
    }

    private PlayerLife playerLife;

    public PlayerLife getCharacterLife() {
        return playerLife.Life().getCharacterLife();
    }

    public void setPlayerLife(PlayerLife playerLife) {
        this.playerLife = playerLife;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        DefaultClass.playerClass = playerClass;
    }

    public int getSkillDamage() {
        return skillDamage;
    }

    public void setSkillDamage(int skillDamage) {
        DefaultClass.skillDamage = skillDamage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        DefaultClass.damage = damage;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        DefaultClass.exp = exp;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        DefaultClass.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        DefaultClass.energy = energy;
    }

    public void printStatus(){
        System.out.println("========" + getPlayerClass() + " " + getName() + " " + "스탯" + "=========");
        System.out.println("체력 : " + getHealth());
        System.out.println("경험치 : " + getExp());
        System.out.println("공격력 : " + getDamage());
        System.out.println("에너지 : " + getEnergy());
        System.out.println("스킬데미지 : " + getSkillDamage());
        System.out.println("돈 : " + getMoney());
        System.out.println("=============================");
    }


}
