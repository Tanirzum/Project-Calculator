import java.util.function.*;
public class Test {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(1, 1);
        int b = calculator.devide.apply(10, 2);
        int c = calculator.multiply.apply(a, b);
        int d = calculator.abs.apply(-c);
        int e = calculator.pow.apply(d);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
