package exercise;

import com.example.shoppingmall.utils.Validator;

import java.util.*;

public class NumberBaseballGame {
    public static void main(String[] args) {
        int[] answers = new int[3];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;

        for (int i=0;i<3;i++) {
            answers[i] = random.nextInt(10);
            for (int j=0;j<i;j++) {
                if (answers[i] == answers[j]) {
                    i--;
                    break;
                }
            }
        }

        while (true) {
            try {
                System.out.print("숫자 3개를 입력하세요.");
                String input = scanner.nextLine();

                int strike = 0, ball = 0, out = 0;
                for (int i = 0; i < 3; i++) {
                    if (answers[i] == Integer.parseInt(String.valueOf(input.charAt(i)))) {
                        strike++;
                    } else if (input.contains(Integer.toString(answers[i]))) {
                        ball++;
                    } else out++;
                }

                if (strike == 3) {
                    System.out.println("정답입니다.");
                    break;
                } else if (strike == 0 && ball == 0) {
                    System.out.println("3 Out");
                } else {
                    cnt++;
                    System.out.println(strike+"S " + ball+"B " + out + "O");
                    System.out.println((10 - cnt)+"번의 기회가 남았습니다.");
                    if (cnt == 10) {
                        System.out.println("게임 종료! 정답은~"+answers[0] + answers[1] + answers[2] +"였습니다 :)");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자만 입력하세요!!");
            }
        }
        scanner.close();
    }

}
