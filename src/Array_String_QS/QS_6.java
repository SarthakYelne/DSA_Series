package Array_String_QS;

//     String  Compression:  Implement  a  method  to  perform  basic  string  compression  using  the counts 
// of  repeated  characters.  For  example,  the  string  a a b c c c c c a a a  would  become  a 2 b l c 5 a 3 .  If  the 
// "compressed "string would  not  become smaller than the original  string,  your method  should  return 
// the original string. You can assume the string  has only uppercase and  lowercase letters (a - z)

public class QS_6 {

public static String Compression (String str) {
    StringBuilder compressed = new StringBuilder();
    
    int countCompress = 0;

    //If next character is different than the current, append this character to result.
    for (int i = 0; i < str.length(); i++) {
        countCompress++;

        if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
            compressed.append(str.charAt(i));
            compressed.append(countCompress);
            countCompress = 0;
        }
    }
    return compressed.length() < str.length() ? compressed.toString() : str;
}

public static void main(String[] args) {
    String s1 = "aabcccccaaa";
    System.out.println("\n"+Compression(s1));
    
    String s2 = "aacccba";
    System.out.println(Compression(s2));

    String s3 = "AAAIIIIIIMMMMMMMMMM";
    System.out.println(Compression(s3));
}
}
