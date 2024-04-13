import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int possibleSkills = 0; // 가능한 스킬트리 개수

        HashMap<Character, Integer> skillOrder = new HashMap<>(); // 스킬 순서 저장을 위한 HashMap
        for (int i = 0; i < skill.length(); i++) {
            skillOrder.put(skill.charAt(i), i); // 각 스킬의 순서를 저장
        }

        for (String tree : skill_trees) { // 스킬트리 반복
            if (isValidSkillTree(skillOrder, tree)) { // 유효한 스킬트리인지 확인
                possibleSkills++; // 가능한 스킬트리 개수
            }
        }

        return possibleSkills; // 가능한 스킬트리 개수 반환
    }

    private boolean isValidSkillTree(HashMap<Character, Integer> skillOrder, String tree) {
        int prevIndex = -1; // 이전 스킬의 순서를 저장하는 변수

        for (char s : tree.toCharArray()) { // 스킬트리 순회
            if (skillOrder.containsKey(s)) { // 해당 스킬 순서확인
                int currIndex = skillOrder.get(s); // 해당 스킬의 순서 가져오기

                if (prevIndex + 1 != currIndex) { // 이전 스킬의 순서와 다르다면
                    return false; // 무효
                }
                prevIndex = currIndex; // 다음 스킬을 위해 이전 스킬 갱신
            }
        }

        return true; // 모든 스킬 순서가 올바를때
    }
}
