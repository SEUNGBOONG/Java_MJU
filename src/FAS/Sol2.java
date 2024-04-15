package FAS;

import java.util.*;

class Solution {
    public int solution(int[] nums) { // 메서드명을 solution으로 변경
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxSelect = nums.length / 2; // 선택 가능한 최대 폰켓몬 종류
        int maxSpecies = set.size(); // 중복을 제외한 폰켓몬 종류 수

        return Math.min(maxSelect, maxSpecies); // 최대 종류 수와 중복을 제외한 종류 수 중 작은 값 반환
    }
}
