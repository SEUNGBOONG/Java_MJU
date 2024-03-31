import LAST1.Sol17;

public class Sol20 {
    public String name;
    private long id;

    public Sol20(long id) {
        this.id = id;
    }

    public Sol20(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public static void main(String[] args) {
        Sol20 h2 = new Sol20(34L);
        h2.name = "sue";
        Sol20 h3 = new Sol20("tom", 56L);
        System.out.println("h2: " + h2.name + " " + h2.getId());
    }
}
