package ee.taltech.b_practise.assignment3;

import org.w3c.dom.ls.LSOutput;
import java.util.stream.*;
import java.util.List;

public class Multiplier {
    //todo A modify function to pass tests
    public static int function(int a, int b){
        return a * b;
    }
    //todo B modify function to pass edge case tests
    //todo C make your solution pretty
    //todo D use streams

    /**
     * multiplies each param element with multiplier
     */
    public static List<Integer> multiplier(List<Integer> params, Integer multiplier) {
        if (params == null){
            return List.of();
        }
        if (multiplier == null){
            return params;
        }
        else{
            return params.stream()
                    .map(x -> x = x * multiplier)
                    .collect(Collectors.toList());
        }
    }
}