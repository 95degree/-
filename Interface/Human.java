package Interface;

public class Human {
    private Weapon weapon;
    public Human(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        weapon.attack();
    }

    public void block(){
        weapon.block();
    }

    public static void main(String[] args) {
        Human human = new Human(new Axe());
        Human human1 = new Human(new Sword());
        human.attack();
        human.block();
        human1.attack();
        human1.block();
    }
}
