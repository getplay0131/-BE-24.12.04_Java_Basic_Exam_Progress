package Exam_2411282_241129;

public class Account {
    String  accoountNumber;
    String ownerName;
    int balance;

    Account() {

    }

    Account(String accoountNumber, String ownerName) {
        this.accoountNumber = accoountNumber;
        this.ownerName = ownerName;
        this.balance = 0;

    }

    int deposit(int amount) {
        if (amount < 0) {
            System.out.println("질못된 입금액 입니다.");
            return balance;
        }
        return balance += amount;
    }

    int withdraw(int amount) {
        if (amount <= balance) {
            int beforeBalance = balance;
            balance -= amount;
            System.out.println("잔액 : " + beforeBalance + "(원) 에서 " + amount + "(원)을 인출하여 잔액은" + balance + "(원) " +
                    "입니다");
        } else {
            System.out.println("잔액 부족으로 인출이 불가합니다.");
            return balance;
        }
        return balance;
    }

    boolean transfer(Account other, int amount) {
        if (amount > balance) {
            System.out.println("잔액이 부족하여 이체가 불가합니다.");
            return false;
        } else if (amount == balance) {
            System.out.println("이체 후 잔액은 0원입니다.");
            return true;
        }
        this.balance -= amount;
        other.balance += amount;
        return true;
    }

    int getBalance(){
        return  balance;
    }
}