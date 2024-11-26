package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
    ValueData valueData = new ValueData();
        for (int i = 1; i <= 5; i++) {
            valueData.add();
        }
        System.out.println("최종 숫자 = " + valueData.value);
    }

}