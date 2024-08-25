package Array_String_QS;
// Question - Check if the two  strings  have  identical  character counts. 

public class QS_2 {

    public static boolean permutation(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[128];

        for (char c : s.toCharArray()) {
            letters[c]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int c = t.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String val1 = "dog";
        String val2 = "god";

        System.out.println(permutation(val1, val2));
        // Output is true

    }
}
