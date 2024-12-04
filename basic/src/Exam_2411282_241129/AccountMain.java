package Exam_2411282_241129;

public class AccountMain {
    public static void main(String[] args) {
    Account acc1 = new Account("1111","김철수");
    Account acc2 = new Account("2222","이영희");

    acc1.deposit(10000);
    acc1.transfer(acc2,3000);
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
    }
}