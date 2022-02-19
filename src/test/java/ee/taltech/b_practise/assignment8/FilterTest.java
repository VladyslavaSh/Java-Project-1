package ee.taltech.b_practise.assignment8;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class FilterTest {

    //todo write the tests you think are necessary :)

    @Test
    void ftest(){

        PositivesAndNegatives test = new Filter().filterToPositivesAndNegatives(List.of(2, -8, -1, 0, 9, 5, -6));

        assertIterableEquals(List.of(2, 0, 9, 5), test.getPositives());
        assertIterableEquals(List.of(-8, -1, -6), test.getNegatives());
    }
}
