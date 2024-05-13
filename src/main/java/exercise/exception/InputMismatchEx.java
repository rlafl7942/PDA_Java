package exercise.exception;

import com.example.shoppingmall.utils.Validator;

import java.util.Scanner;

public class InputMismatchEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String input = scanner.next();

            if (Validator.isAlpha(input) && input.equals("q"))
                break;

            try {
                int score = Integer.parseInt(input);

            if (Validator.isNumber(score) && score>=60)
                System.out.println("합격");
            else
                System.out.println("다음에 다시 봐용ㅋ");
            } catch (NumberFormatException e) {
                // 잘못된 문자열을 숫자로 형 변환할 때 발생하는 예외 클래스
                System.out.println("NumberFormatException");
            }

        }
        System.out.println("프로그램 종료");
        scanner.close();
    }
}
