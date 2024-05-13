package exercise.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MbtiThrowsEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=== MBTI 검사를 시작합니다. ===");
            checkEorI(scanner);
            /**
             * 1. 나는 밖에서 에너지를 얻는다.
             * 2. 나는 이불 속에서 에너지를 얻는다.
             * 당신의 선택은? 1 or 2
             * 1 -> E, 2 -> I
             * 만약 입력을 1a 처럼 잘못하면 예외 터뜨리기!
             */
            System.out.println("=== MBTI 검사가 종료되었습니다. ===");

        } catch (InputMismatchException e) {
            System.out.println("키보드 입력이 잘못되었습니다.");
        } finally {
            if (scanner != null) {
                System.out.println("스캐너가 닫혔습니다.");
                scanner.close();
            }
        }
    }
    public static void checkEorI(Scanner scanner) throws InputMismatchException {
        System.out.println("1. 나는 밖에서 에너지를 얻는다. 2. 나는 이불 속에서 에너지를 얻는다.");
        System.out.println("당신의 선택은? 1 or 2");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("E형 인간");
        } else if (choice == 2) {
            System.out.println("I형 인간");
        } else {
            System.out.println("1 or 2 선택하세요.");
        }

    }
}
