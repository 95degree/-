package Interface;

public class Axe implements Weapon{

    @Override
    public void attack() {
        System.out.println("도끼로 때리기");
    }

    @Override
    public void block() {
        System.out.println("도끼로 막기");
    }
}
