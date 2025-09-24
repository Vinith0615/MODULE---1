public class mixedoperator {
    public static void main(String[] args) {
        int a = 4, b = 2, c = 7;
        int result = ++a * (b-- + ~c) - (-b);
        System.out.println("Result : " + result); 

        // Step 1: Prefix increment (++a) increases a from 4 to 5 before use
        // Step 2: Postfix decrement (b--) uses b as 2, then decreases it to 1
        // Step 3: Bitwise NOT (~c) flips all bits of 7, resulting in -8
        // Step 4: Inner expression (b-- + ~c) becomes 2 + (-8) = -6
        // Step 5: Multiply result of step 4 with ++a → 5 * (-6) = -30
        // Step 6: -(-b) is -(-1) = 1 (since b is now 1)
        // Final result: -30 + 1 = -29

    }
}