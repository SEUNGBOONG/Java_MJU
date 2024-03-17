package LAST2;

class Adder {
    // (17.1) - 메서드 추가: 정수형 변수 두 개를 더하는 메서드
    static int add(int a, int b) {
        return a + b;
    }

    // (17.2) - 메서드 추가: 실수형 변수 세 개를 더하는 메서드
    static double add(double a, double b, double c) {
        return a + b + c;
    }
}

class s17 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(12.3, 12.6, 11.0));
    }
}

