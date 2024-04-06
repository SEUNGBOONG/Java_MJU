package LAST1;
import java.util.Vector;

public class Sol11 {
     public static void main(String[] args) {
            Vector<Object> data = new Vector<Object>(3);
            data.add("사회");
            data.add("맞춤형");
            data.addElement(" 스마트");
            data.add("클라우드");
            data.add("지능");

            data.add(4, "인공"); // "클라우드" 뒤에 "인공" 삽입 ..빈칸


            System.out.println(data.toString());
        }
    }


