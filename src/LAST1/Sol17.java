package LAST1;

    public abstract class Sol17 {
        // 이하 몸체부분
        public String owner;

        public Sol17(String owner) {
            this.owner = owner;
        }

        public void turnon() {
            System.out.println("power on");
        }

        // turnoff 메서드는 추상 메서드로 선언되었으므로 하위 클래스에서 구현되어야 함
        public abstract void turnoff();

        public static void main(String[] args) {
            System.out.println("phone");
        }
    }

