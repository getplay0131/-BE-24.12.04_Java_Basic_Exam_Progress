package Exam_2411282_241129;

public class Track {
String title;
String artist;
int durationInSeconds;
    int minute;
    int second;


int transformMinute(int seconds){
    this.minute = seconds / 60;
    return minute;
}

    int transformSeconds(int seconds){
        this.second = seconds % 60;
        return second;
    }


void infoSong(){
    System.out.println("제목 : " + title + "\n" + "아티스트 : " + artist + "\n" + "재생시간 : " + minute + ":" + second);
}

Track(String title, String artist) {
    this(title,artist, 0);
}

Track(String title, String artist, int durationInSeconds) {
    this.title = title;
    this.artist = artist;
    this.durationInSeconds = durationInSeconds;
}
}