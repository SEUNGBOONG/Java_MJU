package FAS;

import java.util.*;

public class Sol3 {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A); // A 팀은 이미 순서대로 출전함
        Arrays.sort(B); // B 팀 역시 순서대로 정렬

        int At = 0; // A 팀원
        int Bt = 0; // B 팀원

        while (Bt < B.length) {
            if (A[At] < B[Bt]) { // B팀원이 크면
                answer++; // 승점 증가
                At++; // A 팀원 인덱스 증가
            }
            Bt++; // B 팀원 인덱스 증가
        }

        return answer;
    }
}
