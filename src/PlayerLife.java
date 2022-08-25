import jobClass.*;
import world.*;

import java.util.Scanner;

public class PlayerLife extends DefaultClass{
    public void Life(){
        int day = 1;
        System.out.println(getHealth()); // 사고다....... while문에 들어가지도 못해요...

        while (getHealth() != 0){
            System.out.println("===========" + day + "일 차" + "===========");
            System.out.println();
            System.out.println("현재 위치 : " + getLocation());
            System.out.println();
            System.out.println(getHealth());
            setHealth(getHealth() - 10);
            System.out.println(getHealth());

            day += 1;
        }

        System.out.println("[    YOU DIE    ]");
    }
}
