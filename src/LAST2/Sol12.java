package LAST2;
//16번문제
public class Sol12 {
    int id;
    String name;

    Sol12(int id) {this.id = id;} // 빈칸 16

    void display() {
        System.out.println(id + " " + (name == null ? "null" : name)); // 이름이 null일 경우 "null" 출력
    }

    public static void main(String args[]) {
        Sol12 s1 = new Sol12(1234);
        s1.display();
    }
}
