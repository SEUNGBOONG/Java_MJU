package LAST2;

public class s20 {
    public static void main(String[] args) {
        Integer day = 5; // (20.1) Wrapper 클래스를 이용한 변수 초기화

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                System.out.println("fifth day"); // 추가된 출력문
                break;

            case 6:
                System.out.println("fifth day"); // (20.2) fifth day를 Thursday로 수정
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
}
