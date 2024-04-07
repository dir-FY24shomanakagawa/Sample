package Sample;

import javax.sql.rowset.CachedRowSet;

public class SwitchSample {

    public static void main(String[] args) {
        var score = 72;
        
        switch (score / 10){
            case 10 -> System.out.println("満点");
            case 9,8 -> System.out.println("よくできた");
            case 7,6 -> System.out.println("合格");
            default -> System.out.println("赤点です。");
            
        }

    }

}
