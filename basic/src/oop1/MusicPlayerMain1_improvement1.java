package oop1;

public class MusicPlayerMain1_improvement1 {
    public static void main(String[] args) {
    MusicPlayerData Data = new MusicPlayerData();

//    플레이어 켜기
        Data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

//        볼륨 증가
        Data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + Data.volume);

        //        볼륨 증가
        Data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + Data.volume);

        //        볼륨 감소
        Data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + Data.volume);

//        음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (Data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + Data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
//        음악 플레이어 끄기
        Data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
//        볼륨 증가
    }
}