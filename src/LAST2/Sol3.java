package LAST2;
interface F {
    public void myme();
}

interface S {
    public void myo();
}

class demo implements F, S {
    public void myme() {
        System.out.println("some ");
    }

    public void myo() {
        System.out.println("other ");
    }
}

public class Sol3{
    public static void main(String[] args) {
        demo myj = new demo();
        myj.myo();
    }
}


