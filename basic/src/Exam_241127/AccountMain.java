package Exam_241127;

public class AccountMain {
    public static void main(String[] args) {
    Account account = new Account();

    int money;
    money = 10000;
    account.deposit(money);
    printMsg(money + "원이 입금 되었습니다.");
        if (account.withdraw(11000) == -1 ) {
            AccountMain.printMsg("잔액이 부족합니다.");
        } else {
            AccountMain.printMsg("잔액 : " +account.balance + " 원");
        }
    }

    static void printMsg(String msg){
        System.out.println(msg);
    }
}
