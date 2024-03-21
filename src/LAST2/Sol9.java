package LAST2;

class Parent1 {
    String name;

    void show() {
        System.out.println("Pa");
    }
}

class Child1 extends Parent1 {
    int age;

    void show() {
        System.out.println("chi");
    }
}

public class Sol9 {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        p.name = "이";

        // (11) - To cast the Parent1 reference to Child1 to access Child1-specific members
        Child1 d = (Child1) p;

        // (12) - To call the overridden method in the Child1 class
        d.show();
        d.age = 18;
        System.out.println(p.name + " " + d.age);
    }
}
