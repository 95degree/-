package Interface;

public class Sword implements Weapon{
    @Override
    public void attack() {
        System.out.println("검으로 때리기");
    }

    @Override
    public void block() {
        System.out.println("검으로 막기");
    }
}
