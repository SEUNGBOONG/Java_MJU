package ch;

public class Sol9 {
    public static void main(String[] args) {
        System.out.println("명령한 인자 갯수 > " + args.length);


        for(String value: args)
            System.out.print(value + " ");

    }
}
