package oop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MusicPlayerMain_imp {
    public static void main(String[] args) throws IOException {
        MusicPlayerData_imp data = new MusicPlayerData_imp();
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        //음악 플레이어 켜기
        data.on();

        boolean isEnd = false;
        while (!isEnd){
        System.out.println("기능을 선택해주세요!");
        System.out.println("1. 🔊 (볼륨 증가)");
        System.out.println("2. 🔉 (볼륨 감소)");
        System.out.println("3. 📃 (상태 확인)");
        System.out.println("4. 📴 (플레이어 종료)");
        int choice = Integer.parseInt(scan.readLine());

        //볼륨 증가
        if (choice == 1) {
            data.volumeUp();
        //볼륨 감소
        } else if (choice == 2) {
            data.volumeDown();
        //음악 플레이어 상태
        } else if (choice == 3) {
            data.showStatus();
        } else if (choice == 4) {
            data.off();
            isEnd = true;
        } else {
            System.out.println("기능을 선택해주세요!");
            continue;
        }
        }


        //음악 플레이어 끄기

    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}