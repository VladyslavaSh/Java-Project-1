package ee.taltech.b_practise.assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenMax {

    //todo A modify function to pass tests
    //todo B make your solution pretty
    //todo C use streams

    /**
     * returns maximum even number from the list
     * even numbers are numbers evenly divisible by 2
     * for example 2, -6, 128, 2n
     */
    public static Integer maximum(List<Integer> params) {

        if (params == null) { return null; }

        List<Integer> evenIntegers = params.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        if (evenIntegers.isEmpty()) { return null; }

        int evenMax = evenIntegers.stream().max(Integer::compare).get();
        return evenMax;

    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-1, -3);
        System.out.println(maximum(numbers));
    }

    //todo D programmer has designed to return null on null/empty input
    // You can observe it on tests as: _null_is_maximum_of_no_numbers, _null_is_maximum_of_odd_numbers
    // Can you think of 2 different ways developer could have solved null/empty inputs?
    // 1 Returning an empty List
    // 2 Throwing and Exception
    //todo E
    // Which option would you prefer and why?
    // Answer: Second. I prefer to see an understandable stack trace whenever there's a problem with my code. If cases where I can't control the input I would just use Try-Catch clauses.
}
