package LAST1;

public class Sol2 {
    public static void main(String[] args) {
        int ary[][] = {{78, 48, 78, 98}, {99, 92}, {29, 64, 83}};
        for (int i = 0; i < ary.length; i++ ) { // 2.1 빈탄
            int sum = 0;
            for (int j = 0; j < ary[i].length; j++) { // 2.2빈칸
                sum += ary[i][j];
            }
            System.out.printf("\t합: %d ", sum);
        }
    }
}
