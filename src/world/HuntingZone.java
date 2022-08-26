package world;

public class HuntingZone extends PlayerLocation{
    PlayerLocation playerLocation = new PlayerLocation();
    Monster monster = new Monster();
    public void location_set(){
        playerLocation.setLocation("HuntingZone");
    }
}
