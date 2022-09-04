package player;

import java.util.ArrayList;

public interface DieMassage {
    public static void dieMassage(int day){
        ArrayList<String> dieMassage = new ArrayList<>();
        dieMassage.add("Y");
        dieMassage.add("O");
        dieMassage.add("U");
        dieMassage.add(" ");
        dieMassage.add("D");
        dieMassage.add("I");
        dieMassage.add("E");
        for (String s : dieMassage) {
            try {
                Thread.sleep(300);
                System.out.print(s);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\n");
        System.out.println("생존 일 수 : " + day + "일");
    }
}
