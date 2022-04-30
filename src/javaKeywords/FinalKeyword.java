package javaKeywords;

public class FinalKeyword {
    final static int VAR1 = 21;
    final int VAR2 ;

    public FinalKeyword(int var2) {
        this.VAR2 = var2;
    }

    public static void main(String[] args) {
//        VAR1 = 22;  // gives error
        System.out.println(VAR1);
    }

}
