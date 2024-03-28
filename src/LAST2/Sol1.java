package LAST2;
class Boss {
    int v;
    int v2;
    Boss(int v1) {
        v = v1;
        v2 = 0;
        System.out.println("v1= " + v1 + ", v2= " + v2);
    }
}

class Man extends Boss {
    Man(int v1, int v2) {
        super(v2);
        System.out.println("v1= " + v1 + ", v2= " + v2);
    }
}

public class Sol1 {
    public static void main(String[] args) {
        new Man(5, 0);
        new Man(7, 5);
    }
}