package LAST1;
class Sol13 {
    public String name = "아빠";
}

class Man extends Sol13 {
    public String name = "남자";
    public int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("체중 " + weight + ", " + name + ": " + super.name);
    }
}

class manTest {
    public static void main(String[] args) {
        Man son1 = new Man();
        son1.setWeight(70);
        son1.printInfo();
    }
}
