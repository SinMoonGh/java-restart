package variable;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생수를 입력하세요: ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][3]; // 행이 1보다 많을 수도 있음
        int sum;

        for (int i = 0; i < n; i++) {
            System.out.println(i + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.println("국어 점수:");
                    arr[i][j] = scanner.nextInt();
                }
                if (j == 1) {
                    System.out.println("영어 점수:");
                    arr[i][j] = scanner.nextInt();
                }
                if (j == 2) {
                    System.out.println("수학 점수:");
                    arr[i][j] = scanner.nextInt();
                }
            }
        }
        for (int i = 0; i < n; i++) {
            sum = 0; // sum 변수를 초기화합니다.
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
            System.out.println(i + "번 학생의 총점: " + sum);
        }
    }

}
