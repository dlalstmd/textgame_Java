package player;

import java.util.ArrayList;
import java.util.HashMap;

public interface PlayerInventory {
    HashMap<String, Integer> inventory = new HashMap<>();

    ArrayList<String> weaponList = new ArrayList<>();

    public static void weaponListPrint(int count){
        if(count == 1){
            weaponList.add("사신도 멸하는 작열의 검");
            weaponList.add("연옥을 재단하 자르는 칼끝");
            weaponList.add("구적하는 불하늘의 양손");
            weaponList.add("시조의 불꽃을 품은 꽃");
            weaponList.add("치열한 수라에 지는 창 끝");
            weaponList.add("운명을 불태우는 총탄");
            for(int i=0 ; i<weaponList.size() ; i++){
                System.out.println(i+1 + "번 무기 : " + weaponList.get(i));
            }
        } else {
            for(int i=0 ; i<weaponList.size() ; i++){
                System.out.println(i+1 + "번 무기 : " + weaponList.get(i));
            }
        }

    }

    public static void setInventory(String name, int value){
        inventory.put(name, value);


    }

    public static void deleteInventory(String name){
        inventory.remove(name);
        System.out.println(name + "이 삭제되었습니다.");
    }
}
