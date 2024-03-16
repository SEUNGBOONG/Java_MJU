package LAST2;

class Dog extends Animal {
    // (18.1) - Dog 클래스의 move() 메서드 오버라이드
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}

class Animal {
    // (18.2) - Animal 클래스의 move() 메서드
    public void move() {
        System.out.println("Animals can move");
    }
}

public class Sol14 {
    public static void main(String args[]) {
        Animal a = new Animal();
        Animal b = new Dog(); // Dog 객체를 Animal 타입으로 참조

        a.move();
        b.move();
    }
}
