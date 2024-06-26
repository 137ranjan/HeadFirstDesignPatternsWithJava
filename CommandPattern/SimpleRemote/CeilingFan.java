
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location+" ceiling fan is set to high");
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public void on() {
        System.out.println(location + " fan is on");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " fan is off");
    }

    public int getSpeed() {
        return speed;
    }
}
