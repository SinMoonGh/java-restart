package variable;

public class method3 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance);
        balance = withdraw(balance);

        System.out.println("최종 잔액은 " + balance + "원 입니다.");
    }

    public static int deposit(int balance) {
        int deposit_amount = 1000;
        balance += deposit_amount;
        System.out.println(deposit_amount + "원을 입금하였습니다. 현재 잔액은 " + balance + "원 입니다.");
        return balance;
    }

    public static int withdraw(int balance) {
        int withdraw_amount = 2000;
        if (balance >= withdraw_amount) {
            balance -= withdraw_amount;
            System.out.println(withdraw_amount + "원을 출금하였습니다. 현재 금액은 " + balance + "원 입니다.");
            return balance;
        } else {
            System.out.println("잔액 부족");
            return balance;
        }
    }
}
