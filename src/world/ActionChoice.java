package world;

import java.util.Scanner;

public interface ActionChoice {
    Scanner sc = new Scanner(System.in);

    public static String Action(int start){
        String answer = "start";
        if(start != 0){
            System.out.print("회복, 사낭터, 스탯출력, 상점, 다음날, 자결 중 선택 : ");
            answer = sc.next();
        }
        else {
            System.out.println("시작!");
        }
        return answer;
    }
}
