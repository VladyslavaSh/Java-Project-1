package ee.taltech.b_practise.assignment1;

public class Subtraction {

    //todo A create a static function that takes in two ints
    // and returns the result of subtracting second element from the first
    // P.S pay attention to function and parameter names

    public static int function(int a, int b){

        return b - a;
    }


    public static void main(String[] args) {
        //todo B
        // - call your newly created function with 5 and 2, print out the result
        // - call your newly created function with -5 and -2, print out the result

        int result1 = function(5, 2);
        System.out.println(result1);
        int result2 = function(-5, -2);
        System.out.println(result2);

        //todo C if you were to add another method
        // with the same name, but 3 inputs, then it would be an example of?
        // a) overreaching?
        // b) overloading?
        // c) overriding?
        // d) overreacting?
        // e) overlooking?
        // Answer: с
    }
}

