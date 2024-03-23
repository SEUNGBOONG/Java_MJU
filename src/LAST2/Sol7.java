package LAST2;


class Parent {
    public String surname;

    void PrintData() {
        System.out.println("p");
    }

    public Parent(String surname) {
        this.surname = surname;
    }
}

class Child extends Parent {
    public String name;

    void PrintData() {
        System.out.println("chi");
    }

    public Child(String surname, String name) {
        super(surname);
        this.name = name;
    }
}

public class Sol7 {
    public static void main(String[] args) {
        Child c = new Child("홍 ", "길동");

        // (9) - To display "홍 길동"
        System.out.println(c.surname + c.name);

        // (10) - To call the overridden method in the Child class
        c.PrintData();
    }
}
