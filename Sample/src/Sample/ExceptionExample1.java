package Sample;

public class ExceptionExample1 {

    public static void main(String[] args) {
        try {
            System.out.println("割り算開始");
            int a = 10 / 0;
            System.out.println(a);
        } catch(ArithmeticException e){
            System.out.println("ArithmeticExceptinが発生:" + e.getMessage());
        } finally {
            System.out.println("割り算終了");
        }
        
        System.out.println("処理終了");
        

    }

}
