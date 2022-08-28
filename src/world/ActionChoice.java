package world;

import java.util.Scanner;

public interface ActionChoice {
    Scanner sc = new Scanner(System.in);

    public static String Action(){
        System.out.print("상점, 사낭터 중 어디가시겠습니까? : ");
        String answer = sc.next();
        return answer;
    }
}
