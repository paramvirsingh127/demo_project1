package src;

public class ExceptionHandlint{
    // we can be call exception to runtime error
    public static void main(String[] args) {
        int a = 141;
        int b = 0;
        double div = 0;
        try {
            div = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }finally {
            System.out.println("this divided by zero");
        }


    }
}
