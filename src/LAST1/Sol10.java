package LAST1;
import java.util.StringTokenizer;

public class Sol10 {

    public static void main(String[] args) {
        String str = "3+ 4{5+6)*7";
        String modifiedStr = str.replaceAll("[()]", "").replace("*", "").replace("{", "").replace(")", "$)");

        StringTokenizer st2 = new StringTokenizer(modifiedStr, "+");
        pr(st2);
    }

    public static void pr(StringTokenizer st) {
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "$");
        }
    }
}
