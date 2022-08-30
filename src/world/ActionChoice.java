package world;

import java.util.Scanner;

public interface ActionChoice {
    Scanner sc = new Scanner(System.in);

    public static String Action(){
        System.out.print("상점, 사낭터, 스탯출력 중 선택 : ");
        String answer = sc.next();
        return answer;
    }
}
