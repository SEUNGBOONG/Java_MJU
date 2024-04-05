package LAST1;
import java.util.HashSet;

public class Sol12 {
        public static void main(String[] args) {
            HashSet<String> setA = new HashSet<String>();
            HashSet<String> setB = new HashSet<String>();

            setA.add("1.0"); setA.add("2.0");
            setA.add("3.0"); setA.add("4.0");
            setA.add("5.0"); setA.add("6.0");
            setA.add("5.0"); setA.add("6.0");

            setB.add("1.0");
            setB.add("5.0"); setB.add("7.0");
            setB.add("5.0"); setB.add("7.0");

            setB.removeAll(setA); // setA에 있는 것들을 setB에서 모두 제거

            System.out.println(setB.toString());
        }
    }


