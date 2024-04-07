package Sample;

public class ForSample {

    public static void main(String[] args) {
        /*for (var i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
        for (var i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }*/
        
        /*for (var i = 2; i <= 100; i+=2) {
            if (i > 20) {
                break;
            }
            System.out.println(i);
        }
        */
        for (var i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }

}
