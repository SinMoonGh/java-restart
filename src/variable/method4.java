package variable;

import java.util.Scanner;

public class method4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;

        while (true) {
            System.out.println("1번 입금, 2번 출금, 3번 잔액 확인, 4번 종료");
            int menu = scanner.nextInt();

            if (menu == 1) {
                balance = deposit(balance, scanner);
            } else if (menu == 2) {
                balance = withdraw(balance, scanner);
            } else if (menu == 3) {
                System.out.println("현재 잔액은 " + balance + "입니다.");
            } else if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }

    }

    public static int deposit(int balance, Scanner scanner) {
        System.out.print("입금액을 입력하세요 :");
        int amount = scanner.nextInt();

        balance += amount;
        System.out.println(amount + "을 입금하셨습니다. 현재 잔액은 " + balance + "원 입니다.");

        return balance;
    }

    public static int withdraw(int balance, Scanner scanner) {
        System.out.print("출금액을 입력하세요 :");
        int amount = scanner.nextInt();

        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "을 출금하셨습니다. 현재 잔액은 " + balance + "원 입니다.");
        }
        return balance;
    }
}

// 1번 입금, 2번 출금, 3번 잔액 확인, 4번 종료
// 타입은 int로 할 생각이고,
// 입금할 금액, 현재 잔액
// 출금할 금액, 현재 잔액
// 현재 잔액
// 종료
// 출금할 때 잔액이 부족하다면 잔액 부족 경고창 띄우기
