package Sample;

public class Logical {

    public static void main(String[] args) {
        int score = 59;//成績
        
        // and:scoreが４０以上かつ５０以下
        System.out.print("scoreが４０以上かつ５０以下　：");
        System.out.println(40 >= score && score <= 50);
        
        // or:scoreが40以上、または50以下
        System.out.print("scoreが40以上、または50以下:");
        System.out.println(40 <= score || score <= 50);
        
        // not:scoreが60以上ではない
        System.out.print("scoreが60以上ではない;");
        System.out.println(!(score >= 60));
        
        
        

    }

}
