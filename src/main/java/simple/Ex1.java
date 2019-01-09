package simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex1 {
    public static void breakMyList(List l) {
        l.add(0, LocalDate.now());
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Fred", "Jim"));
        names = Collections.checkedList(names, String.class);

        names.add("Sheila");
//        names.add(0, LocalDate.now());
//        breakMyList(names);
        System.out.println("Name at head of list is " + names.get(0));
//        String name3 = (String)names.get(3);
        String name3 = names.get(0);
    }
}
