package LAST2;


abstract class X {
    abstract void m1(); //빈칸
}

interface Y {
    public void m2();
}

class ZZ extends X implements Y { //빈칸
    void m1() {
        System.out.println("m1");
    }

    public void m2() {
        System.out.println("m2");
    }
}

public class Sol4 {
    public static void main(String[] args) {
        ZZ ab = new ZZ();
        ab.m1();
    }
}
