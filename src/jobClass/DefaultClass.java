package jobClass;

import player.PlayerInformation;

public class DefaultClass extends PlayerInformation {
    private int exp;
    private int health;
    private int energy;
    private int damage;
    private int skillDamage;
    private String playerClass;

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public int getSkillDamage() {
        return skillDamage;
    }

    public void setSkillDamage(int skillDamage) {
        this.skillDamage = skillDamage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void printStatus(){
        System.out.println("========" + getPlayerClass() + " " + getName() + " " + "스탯" + "=========");
        System.out.println("체력 : " + getHealth());
        System.out.println("경험치 : " + getExp());
        System.out.println("공격력 : " + getDamage());
        System.out.println("에너지 : " + getEnergy());
        System.out.println("스킬데미지 : " + getSkillDamage());
        System.out.println("=============================");
    }
}
