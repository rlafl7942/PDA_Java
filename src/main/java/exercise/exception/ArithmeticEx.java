package exercise.exception;

public class ArithmeticEx {
    public static void main(String[] args) {
        int result = divide(10, 0);

    }

    public static int divide(int x, int y) {
        int result = 0;
        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수가 없으세요");
        }
        return result;
    }
}


//try {
//result = 10/0;
//        System.out.println("나누기 결과는...");
//        } catch (ArithmeticException e) {
//        System.out.println("0으로는 나누기 못하세용");
//        }