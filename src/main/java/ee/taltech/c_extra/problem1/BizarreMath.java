package ee.taltech.c_extra.problem1;

public class BizarreMath {

    //todo A
    // byte is a data structure from -128 to 127
    // can you explain in plain english (simpler the better)
    // why 127 + 1 = -128 ?! (you can run main method to see it for yourself)
    // Answer:
    // Imagine a stopwatch that counts to 999 seconds. What happens if it reaches 1000?
    // It can't show the 1, so it continues showing the digits after 1
    // Back to the byte. 1111 1111 equals 127, while 0000 0000 equals -128
    // When we add 1 to 1111 1111 we get 1 0000 0000 where 1 can't be shown and so we're left with 0000 0000 (-128)
    //
    //todo B
    // How is this phenomenon called? (this is unrelated, but funny https://www.youtube.com/watch?v=h5Mc55P1i9g)
    // Answer (one word): Overflow
    //
    //todo C
    // What would you recommend developer to do?
    // Answer:
    // 1. Use Math.addExact() method that throws and exception if overflow occurs
    // 2. Use bigger number types (long instead of int for example)
    //
    //todo D
    // Does the similar thing happen with "int/Integer"?
    // Answer: Yes

    public static void main(String[] args) {
        byte num = 127;
        byte num2 = (byte) (num + 1);
        System.out.println(num);
        System.out.println("+ 1");
        System.out.println(num2);
        System.out.println(Integer.MAX_VALUE + 1);
    }
}
