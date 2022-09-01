package player;

import java.util.ArrayList;

public interface DieMassage {
    public static void dieMassage(){
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
                Thread.sleep(500);
                System.out.print(s);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
