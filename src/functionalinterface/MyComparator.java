package functionalinterface;

import java.util.Comparator;

public class MyComparator  implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o2.getAuthor().compareTo(o1.getAuthor());
    }
}
