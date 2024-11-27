package Exam_241127;

public class Account {
    int balance ;
    int amount;
    int shortage;
    int deposit(int amount){
        balance +=amount;
        return balance;
    }

    int withdraw(int amount){
        if (amount > balance) {
            shortage = -1;
            return shortage;
        }
        balance -=amount;
        return balance;
    }


}