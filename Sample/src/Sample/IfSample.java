package Sample;

public class IfSample {

    public static void main(String[] args) {
        var score1 = 80;
        if (score1 >=60) {
            System.out.println("合格です！");
        } else {
            System.out.println("赤点です。。。");
        }
        
        var score2 = 100;
        
        if (score2 == 100) {
            System.out.println("満点です。");
        } else if (score2 >= 80) {
            System.out.println("よくできました。");
        } else if (score2 >= 60) {
            System.out.println("合格です。");
        } else {
            System.out.println("赤点です。");
        }
            
        
        

    }

}
