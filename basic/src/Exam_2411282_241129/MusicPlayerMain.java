//## 문제 1: 음악 플레이어 만들기 (기초)
//### 요구사항
//1. Track 클래스를 만드세요.
//   - 필드: 제목(title), 아티스트(artist), 재생시간(durationInSeconds)
//   - 메서드:
//     - 재생시간을 "분:초" 형식으로 변환하는 메서드
//     - 곡 정보를 출력하는 메서드
//   - 생성자:
//     - 기본 생성자
//     - 제목과 아티스트만 받는 생성자
//     - 모든 필드를 받는 생성자
//
//2. MusicPlayerMain 클래스를 만들고 다음 기능을 구현하세요.
//   - Track 객체 배열을 사용하여 플레이리스트 관리
//   - 플레이리스트에 곡 추가하기
//   - 전체 곡 목록 출력하기
//   - 전체 재생시간 계산하기
//
//실행 예시:
//```
//[플레이리스트]
//제목: 눈의 꽃
//아티스트: 박효신
//재생시간: 4:56
//
//제목: 거리에서
//아티스트: 성시경
//재생시간: 3:45
//
//총 재생시간: 8분 41초
//```

package Exam_2411282_241129;

public class MusicPlayerMain {
    public static void main(String[] args) {
//        Track
        Track track1 = new Track("눈의 꽃","박효신",296);
        Track track2 = new Track("거리에서","성시경",225);

        int minutes = 0;
        int seconds = 0;
        Track [] tracks ={track1,track2};
        System.out.println("[플레이리스트]");

        for (int i = 0; i < tracks.length ; i++) {
            tracks[i].infoSong();
        }

        for (int i = 0; i <tracks.length ; i++) {
            minutes +=tracks[i].transformMinute(tracks[i].durationInSeconds);
            seconds +=tracks[i].transformMinute(tracks[i].durationInSeconds);
        }
        System.out.println("총 재생 시간 : " + minutes + "분 " + seconds + "초");
    }
}