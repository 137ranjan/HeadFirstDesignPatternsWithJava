import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {
    private String[] myList;

    MyStringList(String[] strings) {
        myList = strings;
    }

    public int size() {
        return myList.length;
    }

    public String get(int index) {
        return myList[index];
    }

    public String set(int index, String item) {
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }
}