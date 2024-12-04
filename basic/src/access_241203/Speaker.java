package access_241203;

public class Speaker {
//    private 접근 제어자를 사용함으로 인해, 해당 클래스에서만 값을 설정할 수 있다.
//private int volume;
protected int volume;

Speaker(int volume) {
    this.volume = volume;
}

void volumeUp () {
    if (volume >= 100) {
        System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
    } else {
        volume += 10;
        System.out.println("음량을 10 증가합니다.");
    }
}

void volumeDown(){
    volume -= 10;
    System.out.println("volumeDown 호출");
}

void showVolume(){
    System.out.println("현재 음량 : " + volume);
}
}