import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Iterator<Object> {
    Enumeration<?> enumeration;

    public EnumerationAdapter(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}