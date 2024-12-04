package oop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MusicPlayerMain1_Self_Improvement1_Method {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        MusicPlayerData Data = new MusicPlayerData();
    PlayerOn(Data.isOn);

        System.out.println("무슨 기능을 시작할까요?");
            System.out.println("1. 🔊 (볼륨 증가)");
            System.out.println("2. 🔉 (볼륨 감소)");
            System.out.println("3. 📃 (상태 확인)");
            System.out.println("4. 📴 (플레이어 종료)");
        Data.isOn = true;
    int choice = Integer.parseInt(scan.readLine());
    InputChoice(choice, Data);
    }

//사용자의 기능 선택 받기
    static void InputChoice(int choice, MusicPlayerData Data){
            if (choice == 1) {
                VolumeAdd(Data.volume);
            } else if (choice == 2) {
                VolumeSub(Data.volume);
            } else if (choice == 3) {
                PlayerStatus(Data.isOn, Data.volume);
            } else if (choice == 4) {
                PlayerOff(Data.isOn);
            } else {
                System.out.println("올바른 기능을 선택해 주세요!");
            }
    }

    //    플레이어 켜기
    static void PlayerOn(boolean isOn) {
        if (isOn == false) {
            isOn = true;
            System.out.println("음악 플레이어를 시작합니다.");
        }
    }

//        볼륨 증가
    static int VolumeAdd(int volume) {
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
        return volume;
    }

    //        볼륨 감소
    static int VolumeSub(int volume) {
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);
        return volume;
    }

//        음악 플레이어 상태
    static void PlayerStatus (boolean isOn, int volume) {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    //        음악 플레이어 끄기
    static void PlayerOff(boolean isOn) {
        if (isOn) {
            isOn = false;
            System.out.println("음악 플레이어를 종료합니다.");
        }
    }
}