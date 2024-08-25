package Array_String_QS;

// Question - Is  Unique: Implement an algorithm  to determine  if a  string  has all  unique  characters. What  if you 
// cannot use additional  data  structures?  TC = O(n) SC = O(1)

public class QS_1 {

    public static boolean isUniqueChar(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String testString1 = "abcd";
        System.out.println(isUniqueChar(testString1));
        // Output is true

        String testString2 = "hello";
        System.out.println(isUniqueChar(testString2));
        // Output is false

    }
}
