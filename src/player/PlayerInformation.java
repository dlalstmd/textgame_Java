package player;

public class PlayerInformation {

    private String name;
    private String classSetting;

    private String location = "Beginner Town";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
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
