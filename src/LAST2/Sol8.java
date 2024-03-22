package LAST2;

class Per {
    void talk() {
        System.out.print("fir");
    }
}

class student extends Per {
    void talk() {
        System.out.print("sec");
    }
}

public class Sol8 {
    public static void main(String[] args) {
        Per p = new student(); // 객체 생성하여 부모 클래스 타입으로 참조
        p.talk(); // "sec" 출력
    }
}
