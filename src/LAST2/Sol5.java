package LAST2;

abstract class X1 {
    abstract void me1(); //빈칸
    abstract void me2();//빈칸
}

abstract class Y1 extends X1 {
    void me1() {
        System.out.println("me1");
    }
}

class Z1 extends Y1 {
    void me2() {
        System.out.println("me2");
    }
}

public class Sol5 {
    public static void main(String[] args) {
        Z1 a = new Z1(); //빈칸
        a.me1();
    }
}
