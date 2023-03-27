package java_03_Primitives;

//import java.math.BigDecimal;

public class BiNumberRunner {
    
    public static void main(String[] args) {
        BiNumber number = new BiNumber(2, 3);
        System.out.println(number.add());
        System.out.println(number.multiple());
        number.doubleThem();
        System.out.println(number.getNumber1());
        System.out.println(number.getNumber2());

        //BigDecimal dbl = new BigDecimal("12908397561.1265631523");
    }
}
