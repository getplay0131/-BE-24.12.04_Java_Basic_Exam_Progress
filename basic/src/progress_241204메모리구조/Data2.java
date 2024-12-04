package progress_241204메모리구조;

public class Data2 {
public String name;

public Data2(String name, Counter counter) {
    this.name = name;
    counter.count++;
}
}