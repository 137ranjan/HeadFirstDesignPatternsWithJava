
public class Stereo {
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " stereo is on");
    }

    public void off() {
        System.out.println(name + " stereo is off");
    }

    public void setCd() {
        System.out.println("CD is set on " + name + " stereo");
    }

    public void setDvd() {
        System.out.println("DVD is set on " + name + " stereo");
    }

    public void setRadio() {
        System.out.println("Radio is set on " + name + " stereo");
    }

    public void setVolume(int volume) {
        System.out.println("Volume is set to " + volume + " on " + name + " stereo");
    }
}
