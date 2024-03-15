package LAST2;

public class Sol15 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i != 4) { // 4일 때는 출력을 건너뜁니다.
                System.out.println(i);
            }
            i++;
        }
    }
}
