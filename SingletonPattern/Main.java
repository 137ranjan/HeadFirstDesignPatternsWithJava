public class Main {

    public static void main(String[] args) {
        ChocolateBoiler cb = ChocolateBoiler.getInstance();
        System.out.println(cb);
        cb = ChocolateBoiler.getInstance();
        System.out.println(cb);
    }
}
