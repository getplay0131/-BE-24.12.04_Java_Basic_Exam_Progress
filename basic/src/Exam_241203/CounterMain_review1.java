package Exam_241203;

public class CounterMain_review1 {
    public static void main(String[] args) {
    MaxCounter_review1 counter = new MaxCounter_review1(3);
    counter.increment();
    counter.increment();
    counter.increment();
    counter.increment();
    int count = counter.getCount();
        System.out.println(count);
    }
}