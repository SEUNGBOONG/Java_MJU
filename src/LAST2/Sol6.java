class Per {
    void talk() {
        System.out.print("fir");
    }
}

class student extends Per {
    void talk() {
        System.out.print("sec");
    }
}

public class Sol6 {
    public static void main(String[] args) {
        Per p = new student();
        p.talk();
    }
}
