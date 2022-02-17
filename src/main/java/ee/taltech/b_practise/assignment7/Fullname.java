package ee.taltech.b_practise.assignment7;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.*;
import java.util.List;

public class Fullname {
    //todo A modify function to pass tests
    //todo B make your solution pretty
    //todo C use streams (extra)

    public static String fullname(String firstName, String lastName) {
        List<String> l = new ArrayList<>();
        l.add(firstName);
        l.add(lastName);
        return l.stream()
                .filter(Objects::nonNull)
                .filter(x -> !x.equals(""))
                .collect(Collectors.joining(" "));
    }
}