package oop1;

public class MusicPlayerData_imp {
   boolean isOn;
   int volume = 0;

   void on(){
      isOn = true;
      System.out.println("뮤직 플레이어를 시작합니다. 📱");
   }

   void off(){
      isOn = false;
      System.out.println("뮤직 플레이어를 종료합니다. 📴");
   }

   void volumeUp(){
      System.out.println("현재 볼륨 🔉 : " + volume);
      volume++;
      System.out.println("현재 볼륨 🔊 : " + volume);
   }

   void volumeDown(){
      System.out.println("현재 볼륨 🔊 : " + volume);
      volume--;
      System.out.println("현재 볼륨 🔉 : " + volume);
   }

   void showStatus(){
      System.out.println("음악 플레이어 상태 확인");
      if (isOn) {
         System.out.println("음악 플레이어 ON, 볼륨:" + volume);
      } else {
         System.out.println("음악 플레이어 OFF");
      }
   }
}