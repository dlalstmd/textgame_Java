package player;

import world.PlayerLocation;

public class PlayerInformation extends PlayerLocation {
    private String name;
    private String classSetting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassSetting() {
        return classSetting;
    }

    public void setClassSetting(String classSetting) {
        this.classSetting = classSetting;
    }
}
