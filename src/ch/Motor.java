package ch;

public class Motor extends Sol10 {
    public String name = "자동차 ";
    public int displacement;

    public void printInfo() {
        System.out.print("name" + name);
        System.out.print("최대 속도" + maxSpeed + "km");
        System.out.print("정원: " + seater + "명");
        System.out.println(",배기량:" + displacement + "cc");

    }

    public static void main(String[] args) {
        ch.Motor myCar = new ch.Motor();
        myCar.maxSpeed = 160;
        myCar.seater = 5;
        myCar.displacement = 1500;
        myCar.printInfo();
    }
}