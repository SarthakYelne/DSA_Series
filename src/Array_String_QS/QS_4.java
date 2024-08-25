package Array_String_QS;

import java.util.*;

// Palindrome  Permutation:  Given  a  string,  write  a  function  to  check  if  it  is  a permutation  of  
// a  palindrome.  A  palindrome  is  a  word  or  phrase  that  is  the  same  forwards  and  backwards,  A  
// permutation  is  a  rearrangement  of  letters.  The  palindrome  does  not  need  to  be  limited  to  just  
// dictionary  words.  
// EXAMPLE 
// Input: rcceaar
// Output: T r u e  (permutations: "racecar" "arcare"  etc.)

public class QS_4 {

    public static boolean PalindromePermuation(String theString) {
        Map<Character, Integer> dict = new HashMap<>();

        for (Character c : theString.toCharArray()) { // Count occurences
            if (dict.get(c) == null) {
                dict.put(c, 1);
            } else {
                dict.put(c, dict.get(c) + 1);
            }
        }

        int noofOddCount = 0;

        for (Integer val : dict.values()) { // how manay characters have odd count.
            if (val % 2 != 0) {
                noofOddCount++;
            }
        }

        if (noofOddCount > 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String val1 = "tact coa";
        String val2 = "civic";
        String val3 = "rcceaar";
        String val4 = "Hello";

        System.out.println(PalindromePermuation(val1));
        System.out.println(PalindromePermuation(val2));
        System.out.println(PalindromePermuation(val3));
        System.out.println(PalindromePermuation(val4));

    }
}
