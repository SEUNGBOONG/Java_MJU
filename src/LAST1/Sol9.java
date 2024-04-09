package LAST1;
import java.util.Random;

public class Sol9 {
    public static void main(String[] args) {
        Random p5 = new Random();
        for (int i = 0; i < 3; i++) {
            System.out.printf("%.2f ", p5.nextDouble() * 2 - 1);
        }
    }
}
