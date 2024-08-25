package Array_String_QS;

// One  Away:  There  are  three  types  of  edits  that  can  be  performed  on  strings:  insert  a  character,  
// remove a  character, or replace a  character. Given two  strings,  write a  function  to  check  if they are  
// one edit  (or zero edits)  away.  
// EXAMPLE 
// p a l e , p i e - > t r u e 
// p a l e s , p a l e - > t r u e 
// p a l e , b a l e - > t r u e 
// p a l e , bae - > f a l s e

public class QS_5 {

    // public static boolean OneEditAway(String first, String second) {

    //     if (first.length() == second.length()) {
    //         return oneEditReplace(first, second);
    //     }
    //     if (first.length() + 1 == second.length()) {
    //         return oneEditInsert(first, second);
    //     }
    //     if (first.length() - 1 == second.length()) {
    //         return oneEditInsert(second, first);
    //     }
    //     return false;
    // }

    // private static boolean oneEditReplace(String s1, String s2) {
    //     boolean foundDifference = false;

    //     for (int i = 0; i < s1.length(); i++) {
    //         if (s1.charAt(i) != s2.charAt(i)) {
    //             if (foundDifference) {
    //                 return false;
    //             }
    //             foundDifference = true;
    //         }
    //     }
    //     return true;
    // }

    // private static boolean oneEditInsert(String s1, String s2) {
    //     int index1 = 0;
    //     int index2 = 0;

    //     while (index2 < s2.length() && index1 < s1.length()) {
    //         if (s1.charAt(index1) != s2.charAt(index2)) {
    //             if (index1 != index2) {
    //                 return false;
    //             }
    //             index2++;
    //         } else {
    //             index1++;
    //             index2++;
    //         }
    //     }
    //     return true;
    // }


    //////////////////////////////////////////////////////////////////////////////////////////


    public static boolean OneEditAway(String first, String second) {
        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int index1 = 0;
        int index2 = 0;

        boolean foundDifference = false;

        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (foundDifference) {
                    foundDifference = false;
                }
                foundDifference = true;
                if (s1.charAt(index1) == s2.charAt(index2)) {
                    index1++;
                }
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }

    public static void main(String[] args, String string) {

        String v1 = "wales";
        String v2 = "wale";

        System.out.println(OneEditAway(v1, v2)); // Expected output: true

        String v3 = "pale";
        String v4 = string;

        System.out.println(OneEditAway(v3, v4)); // Expected output: true

        String v5 = "pale";
        String v6 = "pales";

        System.out.println(OneEditAway(v5, v6)); // Expected output: true

        String v7 = "pale";
        String v8 = "bake";

        System.out.println(OneEditAway(v7, v8)); // Expected output: false

    }
}
