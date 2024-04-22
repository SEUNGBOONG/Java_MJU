package ch;

public class Sol5 {
    public static void main(String[] args) {
        int [] copyTo ={1,2,3,4,5,6,7};
        int [] copyFrom ={10,20,30,40,50,60,70,80};
        System.arraycopy(copyFrom,4,copyTo,1,3);


        for (int i =0; i< copyFrom.length; i++)
            System.out.print(copyFrom[i] + " ");
        System.out.println();

        for (int value : copyTo)
            System.out.println(value +" ");
    }
}
