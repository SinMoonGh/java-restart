package variable;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3]; // 행이 1보다 많을 수도 있음

        for (int i = 0; i < 4; i++) {
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
        for (int i = 0; i < 4; i++) {
            System.out.println(i+"번 학생의 총점: "+);
        }
    }

}
