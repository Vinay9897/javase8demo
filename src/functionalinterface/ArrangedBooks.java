package functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrangedBooks {

    static List<Book> books = new ArrayList<>();
    public static List<Book> bookSorting(){
        // first-way, worst way, extra class needs to make then use here
//        Collections.sort(books,new MyComparator());

        // second-way, optimal way, directly call the interface
//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o2.getAuthor().compareTo(o1.getAuthor());
//            }
//        });

        // third-way, best way, use the lambda expression, concise
        Collections.sort(books, (o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor()));
        return books;
    }


    public static void main(String[] args) {

        Book book = new Book();
        book.setName("Tales of demon and god");
        book.setAuthor("a");
        book.setPrice("323");

        Book book2 = new Book();
        book2.setName("Boys over flowers");
        book2.setAuthor("b");
        book2.setPrice("3484");
        Book book3 = new Book();
        book3.setName("Legend of Xianwu");
        book3.setAuthor("z");
        book3.setPrice("34");
        Book book4 = new Book();
        book4.setName("Dora the explorer");
        book4.setAuthor("g");
        book4.setPrice("344");


        books.add(book);
        books.add(book2);
        books.add(book3);
        books.add(book4);


        System.out.println(bookSorting());

    }
}
