package LAST1;
public class Sol15 {
    public static class Person {
        public String name;
        public long number;

        public Person(String name, long number) {
            this.name = name;
            this.number = number;
        }
    }

    public static class Faculty extends Person {
        public long Number;

        public Faculty(String name, long number, long IdNumber) {
            super(name, number);
            this.Number = IdNumber;
        }
    }

    public static void main(String[] args) {
        Faculty f = new Faculty("홍길동", 114021, 6789);
        System.out.println(f.Number + " " + f.number); //15
    }
}
