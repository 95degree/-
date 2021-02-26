class Mobile{
    protected String number;
    public Mobile(String number){
        this.number = number;
    }
}
public class Overriding extends Mobile{
    private int hour;

    public Overriding(String number,int hour) {
        super(number);
        this.hour = hour;
    }
    public int getHour(){
        return hour;
    }

    public static void main(String[] args) {
        Overriding over = new Overriding("011",8);
        Mobile mobile = new Overriding("011",10);
        System.out.println(over.number+" "+ over.getHour());
        System.out.println(mobile.number);
    }
}
