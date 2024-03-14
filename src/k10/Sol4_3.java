package k10;

public class Sol4_3 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++)
            System.out.print(i + " ");
        System.out.println();

        int sum=0;
        for (i =1, sum=0; i<=10; sum+=i, i++);
        System.out.printf("합: %d%n ", sum);

        for(int j= 1,total=0; j<=5; j++){
            total +=j;
            System.out.printf("%d 부터 %d 까지의 합은 ",j,total);
        }
    }

}
