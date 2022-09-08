package world;

import jobClass.DefaultClass;

import java.util.Scanner;

public interface ActionChoice{
    Scanner sc = new Scanner(System.in);
    DefaultClass defaultClass = new DefaultClass();

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

    public static int weaponBuy(int money){
        String answer = null;
        int weaponNum;
        answer = sc.next();
        if(answer.equals("예")){
            System.out.print("몇번 무기를 구입하시겠습니까? : ");
            weaponNum = sc.nextInt();
            defaultClass.setMoney(defaultClass.getMoney()-10000);
            return weaponNum;
        }
        else{
            return 0;
        }
    }
}
