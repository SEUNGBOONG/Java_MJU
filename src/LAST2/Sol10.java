package LAST2;

interface Printable {
}

class A4 implements Printable { // (13.1) Implementing the Printable interface
    public void a() {
        System.out.println("a method");
    }
}

class Call {
    void invoke(Printable p) {
        if (p instanceof A4) {
            A4 a = (A4) p; // (13.2) Casting Printable to A4
            a.a();
        }
    }
}

public class Sol10 {
    public static void main(String[] args) {
        Printable p = new A4();
        Call c = new Call();
        c.invoke(p); // (14) Calling the invoke method of Call class
    }
}
