package Generic;

class Box<T> {
    private T ob;

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }
}
class abc {

}
class BoxSwapDemo{
    public static <T> void swapBox(Box<T> a, Box<T> b){
        T c = b.getOb();
        b.setOb(a.getOb());
        a.setOb(c);
    }

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.setOb(99);
        Box<Integer> box2 = new Box<>();
        box2.setOb(55);
        System.out.println(box1.getOb() + "&"+box2.getOb());
        swapBox(box1, box2);
        System.out.println(box1.getOb() + "&"+box2.getOb());
    }
}


