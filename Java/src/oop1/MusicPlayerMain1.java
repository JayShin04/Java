package oop1;

import java.sql.SQLOutput;

public class MusicPlayerMain1 {
    public static void main(String[] args) {

        // 절차 지향 프로그래밍
//        문제: 음악 플레이어 만들기
//        음악 플레이어를 만들어보자.
//                요구 사항:
// **
// **
//        1. 음악 플레이어를 켜고 끌 수 있어야 한다.
//        2. 음악 프레이어의 볼륨을 증가, 감소할 수 있어야 한다.
//        3. 음악 플레이어의 상태를 확인할 수 있어야 한다.

        // 예시 출력
//         ```
//        음악 플레이어를 시작합니다
//        음악 플레이어 볼륨:1
//        음악 플레이어 볼륨:2
//        음악 플레이어 볼륨:1
//        음악 플레이어 상태 확인
//        음악 플레이어 ON, 볼륨:1
//        음악 플레이어를 종료합니다
        
        int volume = 0;
        // 음악 플레이어 켜기
        boolean isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);

        // 음악 플레이어 상태 확인
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");


    }

}
