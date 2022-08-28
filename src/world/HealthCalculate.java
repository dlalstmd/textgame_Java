package world;

public interface HealthCalculate {
    public static int healthCount(int HP, int Damage){
        return HP - Damage;
    }
}
