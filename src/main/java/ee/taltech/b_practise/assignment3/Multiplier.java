package ee.taltech.b_practise.assignment3;

import java.util.List;
import java.util.ArrayList;

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
        List<Integer> l = new ArrayList<>(params);
        if (multiplier == null){
            return params;
        }
        else{
            for (int i = 0; i < l.size(); i++){
                int a = l.get(i);
                l.set(i, a * multiplier);
            }
        }
        return l;
    }
}