// Sol14.java 파일
package LAST1;

public class Sol14 {
    public String name = "아빠";
    public int height;

    public Sol14(int height) {
        this.height = height;
    }

    public static class Son extends Sol14 {
        public String name = "아들";
        public int weight;

        public Son(int height, int weight) {
            super(height); // (14.1) - Father 클래스의 생성자 호출
            this.weight = weight; // (14.2) - weight 변수 초기화
        }

        public void printInfo() {
            System.out.print(" 체중은 " + weight + " 키는 " + height);
        }

        public static void main(String[] args) {
            Son mySon = new Son(10, 70);
            mySon.printInfo();
        }
    }
}
