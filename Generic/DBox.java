package Generic;

public class DBox<L,R>{
    private L left;
    private R right;

    public void set(L o, R i){
        left = o;
        right = i;
    }

    @Override
    public String toString() {
        return "DBox{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    public static <L,R> DBox<L,R> makeBox(L l ,R a){
        DBox<L,R> box = new DBox<>();
        box.set(l,a);
        System.out.println(box);
        return box;
    }

    public static void main(String[] args) {
        Double a = 0.2;
        System.out.println(makeBox(1,2));
        System.out.println(makeBox("안녕", a));
    }
}
