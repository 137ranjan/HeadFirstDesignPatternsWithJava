import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] ducks = {"Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList duckList = new MyStringList(ducks);
        List<String> ducksSubList = duckList.subList(2, 4);
        System.out.println(duckList);
        System.out.println(ducksSubList);
    }
}
