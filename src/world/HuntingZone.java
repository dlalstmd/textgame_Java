package world;

import player.PlayerInformation;

public class HuntingZone extends PlayerInformation {
    PlayerInformation playerLocation = new PlayerInformation();
    Monster monster = new Monster();
    public void location_set(){
        playerLocation.setLocation("HuntingZone");
    }
}
