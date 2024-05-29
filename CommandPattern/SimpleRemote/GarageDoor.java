public class GarageDoor {
    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(this.name + " door is open");
    }

    public void down() {
        System.out.println(this.name + " door is closed");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
